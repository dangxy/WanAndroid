package com.dangxy.wanandroid.module.category;


import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseLazyFragment;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/7
 */
public class CategoryFragment extends BaseLazyFragment implements CategoryContract.ICategoryView {


    @BindView(R.id.tl_wan_android_list)
    TabLayout tlWanAndroidList;
    @BindView(R.id.vp_wan_android_list)
    ViewPager vpWanAndroidList;
    private CategoryPresenter categoryPresenter;

    public CategoryFragment() {
    }

    @Override
    protected void loadData() {
        categoryPresenter = new CategoryPresenter(this);
        categoryPresenter.getData();
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_category;
    }

    @Override
    protected void initViews() {


    }

    @Override
    public void categoryData(CategoryEntity categoryEntity) {
        CategoryAdapter categoryAdapter = new CategoryAdapter(getFragmentManager(), categoryEntity.getData());
        vpWanAndroidList.setOffscreenPageLimit(categoryEntity.getData().size()-1);
        vpWanAndroidList.setAdapter(categoryAdapter);
        tlWanAndroidList.setupWithViewPager(vpWanAndroidList);
        tlWanAndroidList.setTabMode(TabLayout.MODE_SCROLLABLE);
        tlWanAndroidList.setTabsFromPagerAdapter(categoryAdapter);
       for(int i = 0; i<categoryEntity.getData().size();i++){
           tlWanAndroidList.getTabAt(i).setText(categoryEntity.getData().get(i).getName());
       }
    }

}
