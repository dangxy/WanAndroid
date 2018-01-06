package com.dangxy.wanandroid.utils;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        //Glide 加载图片简单用法
        Glide.with(context).load(path).into(imageView);

        Uri uri = Uri.parse((String) path);
        imageView.setImageURI(uri);
    }
}
