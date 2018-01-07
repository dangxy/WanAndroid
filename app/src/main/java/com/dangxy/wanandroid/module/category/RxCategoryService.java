package com.dangxy.wanandroid.module.category;

import com.dangxy.wanandroid.entity.CommonListEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

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
    /**
     * 获得Tree下边的数据
     * @return
     */
    @GET("article/list/{page}/json")
    Observable<CommonListEntity> listSubData(@Path("page")int page, @Query("cid") String cid);


}
