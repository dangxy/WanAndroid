package com.dangxy.wanandroid.api;

import com.dangxy.wanandroid.utils.MLog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/**
 * @author dangxueyi
 * @description
 * @date 2018/3/30
 */
public class WanAndroidCookieJar implements CookieJar {


    private static HashMap<String, List<Cookie>> map = new HashMap<>();

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        map.put(url.host(), cookies);
        for (Cookie cookie : cookies) {

            MLog.e("cookie", cookie.value());

        }
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        List<Cookie> cookies = map.get(url.host());
        return cookies != null ? cookies : new ArrayList<Cookie>();
    }

    public static void clearCookie() {
        map.clear();
    }

    public static boolean isLogin(){
        return  map.size()>0?true:false;
    }
}