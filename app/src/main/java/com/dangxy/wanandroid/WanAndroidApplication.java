package com.dangxy.wanandroid;

import android.app.Application;
import android.content.Context;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/6
 */

public class WanAndroidApplication extends Application {

    private static Context mContext;

    public static Context getmContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }
}
