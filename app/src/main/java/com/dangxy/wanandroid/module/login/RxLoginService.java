package com.dangxy.wanandroid.module.login;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public interface RxLoginService {

    /**
     * 搜索
     * @return
     */
    @FormUrlEncoded
    @POST("user/login")
    Observable<LoginEntity> loginWithPassword(@Field("username")String username, @Field("password")String  keyWords);
}
