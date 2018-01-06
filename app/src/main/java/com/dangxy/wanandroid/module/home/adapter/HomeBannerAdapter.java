package com.dangxy.wanandroid.module.home.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.module.home.BannerEntity;

import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/6
 */

public class HomeBannerAdapter extends PagerAdapter {

    private List<BannerEntity.DataBean> mArrayList;
    private Context mContext;

    public HomeBannerAdapter(Context mContext, List<BannerEntity.DataBean> list) {
        this.mArrayList = list;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(container.getContext()).inflate(R.layout.home_banner_layout, null);
        ImageView imageView = linearLayout.findViewById(R.id.iv_banner);
        Glide.with(mContext).load(mArrayList.get(position).getImagePath()).into(imageView);
        container.addView(linearLayout);
        return linearLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        LinearLayout view = (LinearLayout) object;
        container.removeView(view);
    }
}
