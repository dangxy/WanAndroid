package com.dangxy.wanandroid.module.category;

import android.os.Bundle;
import android.support.design.widget.TabLayout;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseFragment;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.widget.NoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/7
 */
public class CategorySubFragment extends BaseLazyFragment {

    @BindView(R.id.tl_category_sub_list)
    TabLayout tlCategorySubList;
    @BindView(R.id.vp_category_sub_list)
    NoScrollViewPager vpCategorySubList;
    private ArrayList<TreeEntity> subId;

    public CategorySubFragment() {
    }

    public static CategorySubFragment newInstance(List<TreeEntity> subId) {

        Bundle args = new Bundle();
        args.putParcelableArrayList("subId", (ArrayList) subId);
        CategorySubFragment fragment = new CategorySubFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected void loadData() {
        subId = getArguments().getParcelableArrayList("subId");
        CategorySubAdapter categorySubAdapter = new CategorySubAdapter(getFragmentManager(), subId);
        vpCategorySubList.setOffscreenPageLimit(subId.size()-1);
        vpCategorySubList.setNoScroll(true);
        vpCategorySubList.setAdapter(categorySubAdapter);
        tlCategorySubList.setupWithViewPager(vpCategorySubList);
        tlCategorySubList.setTabMode(TabLayout.MODE_SCROLLABLE);
        tlCategorySubList.setTabsFromPagerAdapter(categorySubAdapter);
        for (int i = 0; i < subId.size(); i++) {
            tlCategorySubList.getTabAt(i).setText(subId.get(i).getName());
        }
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_category_sub;
    }

    @Override
    protected void initViews() {


    }

}
