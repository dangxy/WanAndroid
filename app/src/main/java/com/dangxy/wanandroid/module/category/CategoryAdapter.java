package com.dangxy.wanandroid.module.category;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dangxy.wanandroid.module.category.sub.CategorySubFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments ;
    private List<String> titleList =new ArrayList<>();
    private ArrayList<TreeEntity> subId =new ArrayList<>();
    public CategoryAdapter(FragmentManager fm, List<TreeEntity> treeEntities) {
        super(fm);
        fragments = new ArrayList<>();
        for (TreeEntity treeEntity : treeEntities
                ) {
            subId.addAll(treeEntity.getChildren());
            CategorySubFragment categorySubFragment = CategorySubFragment.newInstance(treeEntity.getChildren());
            fragments.add(categorySubFragment);
            titleList.add(treeEntity.getName());


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
