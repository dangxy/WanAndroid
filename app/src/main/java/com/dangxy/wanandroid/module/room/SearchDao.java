package com.dangxy.wanandroid.module.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import io.reactivex.Flowable;

/**
 * @author dangxueyi
 * @description
 * @date 2018/3/5
 */
@Dao
public interface SearchDao {
    @Query("SELECT  * FROM search WHERE visible =1")
    Flowable<List<SearchEntity>> findAllSearch();

    @Insert
    void addSearch(SearchEntity searchEntity);

    @Delete
    void deleteSearch(SearchEntity searchEntity);

    @Update
    void updateSearch(SearchEntity searchEntity);
}
