package com.dangxy.wanandroid.module.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * @author dangxueyi
 * @description
 * @date 2018/3/5
 */
@Database(entities = {SearchEntity.class},version = 1,exportSchema = false)
public abstract class SearchDataBase extends RoomDatabase {
    /**
     * 搜索
     * @return
     */
    public abstract SearchDao searchDao();

}
