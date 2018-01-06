package com.dangxy.wanandroid;

import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.dangxy.wanandroid.base.BaseActivity;
import com.dangxy.wanandroid.entity.TabEntity;
import com.dangxy.wanandroid.module.CategoryFragment;
import com.dangxy.wanandroid.module.home.HomeFragment;
import com.dangxy.wanandroid.module.MeFragment;
import com.dangxy.wanandroid.module.SearchFragment;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/6
 */
public class MainActivity extends BaseActivity {
    private CommonTabLayout commonTabLayout;
    private String[] mTitles = {"首页", "分类", "搜索", "我的"};
    private int[] mIconNormalSelectIds = {
            R.drawable.icon_home_default, R.drawable.icon_category_default,
            R.drawable.icon_search_default, R.drawable.icon_me_default};
    private int[] mIconSelectIds = {
            R.drawable.icon_home_selected, R.drawable.icon_category_selected,
            R.drawable.icon_search_selected, R.drawable.icon_me_selected};

    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();

    private ArrayList<Fragment> mFragments = new ArrayList<>();
    private TextView title;


    @Override
    protected void initView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
         title = findViewById(R.id.tv_title);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        commonTabLayout = findViewById(R.id.ctl_home_tab);
        mFragments.clear();
        mFragments.add(new HomeFragment());
        mFragments.add(new CategoryFragment());
        mFragments.add(new SearchFragment());
        mFragments.add(new MeFragment());
        mTabEntities.clear();
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconNormalSelectIds[i]));
        }
        commonTabLayout.setTabData(mTabEntities, this, R.id.fl_main, mFragments);
        commonTabLayout.setCurrentTab(0);
        commonTabLayout.setSaveFromParentEnabled(false);
        commonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                switch (position) {
                    case 0:
                        title.setText("首页");
                        break;
                    case 1:
                        title.setText("分类");
                        break;
                    case 2:
                        title.setText("搜索");
                        break;
                    case 3:
                        title.setText("我的");
                        break;
                    default:
                        title.setText("首页");
                        break;
                }
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_main;
    }
}
