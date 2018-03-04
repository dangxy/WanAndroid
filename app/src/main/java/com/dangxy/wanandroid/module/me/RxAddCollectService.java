package com.dangxy.wanandroid.module.me;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author dangxueyi
 * @description
 * @date 2018/3/4
 */

public interface RxAddCollectService {
    /**
     * 添加网站
     * @param name
     * @param link
     * @return
     */
    @FormUrlEncoded
    @POST("lg/collect/addtool/json")
    Observable<AddCollectEntity> addCollectWebsites(@Field("name") String name, @Field("link") String link);
}
