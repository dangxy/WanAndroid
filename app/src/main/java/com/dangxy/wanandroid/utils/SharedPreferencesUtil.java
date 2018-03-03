package com.dangxy.wanandroid.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import com.dangxy.wanandroid.WanAndroidApplication;


/**
 * Created by author_dang on 16/8/15.
 */
public class SharedPreferencesUtil {

    private final static String SP_NAME = "WAN_config";
    private static SharedPreferences sharedPreferences = null;
    private static boolean shouldCommit = Integer.parseInt(Build.VERSION.SDK) < 9;


    private static SharedPreferences getSharedPreferences() {
        if (sharedPreferences == null) {
            synchronized (SP_NAME) {
                if (sharedPreferences == null) {
                    sharedPreferences =
                            WanAndroidApplication.getmContext().getSharedPreferences(SP_NAME,
                                    Context.MODE_PRIVATE);
                }
            }
        }
        return sharedPreferences;
    }

    private static void save(SharedPreferences.Editor editor) {
        if (shouldCommit) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    public static void saveBoolean(String key, boolean value) {
        save(getSharedPreferences().edit().putBoolean(key, value));
    }

    public static void removeValue(String key) {
        save(getSharedPreferences().edit().remove(key));
    }

    public static boolean getBoolean(String key, boolean defValue) {
        return getSharedPreferences().getBoolean(key, defValue);
    }

    public static void saveString(String key, String value) {
        save(getSharedPreferences().edit().putString(key, value));
    }

    public static void saveInt(String key, int value) {
        save(getSharedPreferences().edit().putInt(key, value));
    }

    public static void saveLong(String key, Long value) {
        save(getSharedPreferences().edit().putLong(key, value));
    }


    public static Long getLong(String key, Long defValue) {
        return getSharedPreferences().getLong(key, defValue);
    }


    public static int getInt(String key, int defValue) {
        return getSharedPreferences().getInt(key, defValue);
    }

    public static String getString(String key, String defValue) {
        return getSharedPreferences().getString(key, defValue);
    }

}
