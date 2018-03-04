package com.dangxy.wanandroid.module.me;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public interface RxMeService {
    /**
     * 获取收藏列表
     * @param page
     */
    @GET("lg/collect/list/{page}/json")
    Observable<CollectArticleEntity> getcollectArticles(@Path("page") int page);
    /**
     * 获取网站列表
     */
    @GET("lg/collect/usertools/json")
    Observable<CollectWebsiteEntity> getcollectWebsites();

}
