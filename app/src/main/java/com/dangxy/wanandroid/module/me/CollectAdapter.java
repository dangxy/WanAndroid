package com.dangxy.wanandroid.module.me;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2017/12/30
 */

public class CollectAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private List<String> titleList;

    public CollectAdapter(FragmentManager fm) {
        super(fm);
        fragments = new ArrayList<>();
        titleList = new ArrayList<>();
        titleList.add("我的收藏");
        titleList.add("网站动态");
        initData();
    }

    private void initData() {
        CollectArticleFragment collectArticleFragment = new CollectArticleFragment();
        CollectWebsiteFragment collectWebsiteFragment = new CollectWebsiteFragment();
        fragments.add(collectArticleFragment);
        fragments.add(collectWebsiteFragment);

    }

    @Override
    public Fragment getItem(int position) {
        if (fragments.size() > 0) {
            return fragments.get(position);
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return titleList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (titleList.size() > 0) {
            return titleList.get(position);
        } else {
            return null;
        }
    }
}
