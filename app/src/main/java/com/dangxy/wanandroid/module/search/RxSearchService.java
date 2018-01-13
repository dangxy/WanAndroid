package com.dangxy.wanandroid.module.search;

import com.dangxy.wanandroid.entity.CommonListEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public interface RxSearchService {

    /**
     * 搜索
     * @return
     */
    @FormUrlEncoded
    @POST("article/query/{page}/json")
    Observable <CommonListEntity> getSearchListData(@Path("page") int page, @Field("k")String  keyWords);
}
