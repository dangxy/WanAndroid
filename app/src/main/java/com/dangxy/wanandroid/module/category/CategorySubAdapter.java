package com.dangxy.wanandroid.module.category;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class CategorySubAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments;
    private List<String> titleList = new ArrayList<>();

    public CategorySubAdapter(FragmentManager fm, ArrayList<TreeEntity> arrayListId) {
        super(fm);
        fragments = new ArrayList<>();
        for (int i = 0; i < arrayListId.size(); i++) {
            CategorySubContentFragment categorySubContentFragment = CategorySubContentFragment.newInstance(arrayListId.get(i).getId() + "");
            fragments.add(categorySubContentFragment);
            titleList.add(arrayListId.get(i).getName());


        }
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
