package com.dangxy.wanandroid.module.home;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.module.home.adapter.HomeBannerAdapter;
import com.dangxy.wanandroid.module.home.adapter.HomeListAdapter;
import com.dangxy.wanandroid.widget.BannerSwipeRefreshLayout;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/6
 */
public class HomeFragment extends BaseLazyFragment implements HomeContract.IHomeView {


    @BindView(R.id.srl_home)
    BannerSwipeRefreshLayout srlHome;
    @BindView(R.id.rv_home)
    RecyclerView rvHome;
    private HomePresenter homePresenter;
    private HomeListAdapter homeListAdapter;
    private BannerEntity bannerEntity;
    private HomeBannerAdapter homeBannerAdapter;

    public HomeFragment() {
    }


    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initViews() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvHome.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected void loadData() {
        homePresenter = new HomePresenter(this);
        homePresenter.getData();
        homePresenter.setRefresh(srlHome, rvHome);
    }


    @Override
    public void bannerData(BannerEntity bannerEntity) {
        this.bannerEntity = bannerEntity;
    }

    @Override
    public void homeData(CommonListEntity commonListEntity, int page) {
        if (page == 0) {
            homeListAdapter = new HomeListAdapter(mContext, commonListEntity.getData().getDatas(), bannerEntity);
            rvHome.setAdapter(homeListAdapter);
        } else {
            homeListAdapter.addAll(commonListEntity.getData().getDatas());
        }
    }


}
