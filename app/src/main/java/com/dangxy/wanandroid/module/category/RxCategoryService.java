package com.dangxy.wanandroid.module.category;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/13
 */

public interface RxCategoryService {
    /**
     * 获得知识结构图
     * @return
     */
    @GET("tree/json")
    Observable<CategoryEntity> listTreeData();


}
