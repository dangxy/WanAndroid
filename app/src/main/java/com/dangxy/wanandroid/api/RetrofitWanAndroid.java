package com.dangxy.wanandroid.api;

import android.content.Context;

import com.dangxy.wanandroid.BuildConfig;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.api.cache.SetCookieCache;
import com.dangxy.wanandroid.api.persistence.SharedPrefsCookiePersistor;
import com.dangxy.wanandroid.utils.MLog;
import com.dangxy.wanandroid.utils.NetWorkUtils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author dangxueyi
 * @description WanAndroid 网络请求
 * @date 2017/12/13
 */

public class RetrofitWanAndroid {
    private static final String BASE_URL = "http://wanandroid.com/";
    private static final long TIMEOUT_CONNECT = 30 * 1000;
    private static final long CACHE_SIZE = 1024 * 1024 * 50;

    public Retrofit newInstance(Context context) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okhttpClient(context))
                .build();
        return retrofit;
    }

    ClearableCookieJar cookieJar =
            new PersistentCookieJar(new SetCookieCache(), new SharedPrefsCookiePersistor(WanAndroidApplication.getmContext()));


    public OkHttpClient okhttpClient(Context mContext) {
        File cacheFile = new File(mContext.getCacheDir(), "wan-android");
        Cache cache = new Cache(cacheFile, CACHE_SIZE);
        OkHttpClient okHttpClient = null;
        try {
            okHttpClient = new OkHttpClient.Builder()
                    .cache(cache)
                    .connectTimeout(TIMEOUT_CONNECT, TimeUnit.MILLISECONDS)
                    .addInterceptor(new HttpLoggingInterceptor()
                            .setLevel(BuildConfig.DEBUG ?
                                    HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE))
                    .addInterceptor(new LoggingInterceptor())
                    .cookieJar(cookieJar)
                    .addNetworkInterceptor(mCacheControlInterceptor).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return okHttpClient;
    }

    /**
     * 缓存拦截器
     */
    private final Interceptor mCacheControlInterceptor = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();

            if (!NetWorkUtils.isNetworkAvailable(WanAndroidApplication.getmContext())) {
                request = request.newBuilder()
                        .cacheControl(CacheControl.FORCE_CACHE)
                        .build();
            }

            Response originalResponse = chain.proceed(request);

            if (NetWorkUtils.isNetworkAvailable(WanAndroidApplication.getmContext())) {

                String cacheControl = request.cacheControl().toString();

                return originalResponse.newBuilder()
                        .header("Cache-Control", cacheControl)
                        .build();
            } else {

                return originalResponse.newBuilder()
                        .header("Cache-Control", CacheControl.FORCE_CACHE.toString())
                        .build();
            }
        }
    };

    /**
     * 日志拦截器
     */
    public class LoggingInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            //这个chain里面包含了request和response，所以你要什么都可以从这里拿
            Request request = chain.request();

            long t1 = System.nanoTime();//请求发起的时间
            MLog.d("DANG", String.format("发送请求 %s on %s%n%s",
                    request.url(), chain.connection(), request.headers()));

            Response response = chain.proceed(request);

            long t2 = System.nanoTime();//收到响应的时间

            ResponseBody responseBody = response.peekBody(1024 * 1024);
            MLog.d("wan-android", String.format("接收响应: [%s] %n返回json:【%s】 %.1fms%n%s",
                    response.request().url(),
                    responseBody.string(),
                    (t2 - t1) / 1e6d,
                    response.headers()));


            return response;
        }
    }


}
