package com.dangxy.wanandroid.module.home;

import com.dangxy.wanandroid.entity.CommonCollectEntity;
import com.dangxy.wanandroid.entity.CommonListEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/13
 */

public interface RxHomeService {
    /**
     * 获取首页banner
     * @return
     */
    @GET("banner/json")
    Observable<BannerEntity> listBanner();

    /**
     * 获取首页数据
     * @param page
     * @return
     */
    @GET("article/list/{page}/json")
    Observable<CommonListEntity> getHomeList (@Path("page")int  page);

    /**
     * 收藏文章
     * @param id
     * @return
     */

    @POST("lg/collect/{id}/json")
    Observable<CommonCollectEntity> collect (@Path("id")String  id);

    /**
     * 取消收藏文章
     * @param id
     * @return
     */

    @POST("lg/uncollect_originId/{id}/json")
    Observable<CommonCollectEntity> unCollect (@Path("id")String  id);
}
