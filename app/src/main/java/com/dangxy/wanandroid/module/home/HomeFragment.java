package com.dangxy.wanandroid.module.home;


import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.entity.CommonCollectEntity;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.module.detail.DetailActivity;
import com.dangxy.wanandroid.module.home.adapter.HomeListAdapter;
import com.dangxy.wanandroid.widget.BannerSwipeRefreshLayout;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/6
 */
public class HomeFragment extends BaseLazyFragment implements HomeContract.IHomeView, HomeListAdapter.CollectClickListener {


    @BindView(R.id.srl_home)
    BannerSwipeRefreshLayout srlHome;
    @BindView(R.id.rv_home)
    RecyclerView rvHome;
    private HomePresenter homePresenter;
    private HomeListAdapter homeListAdapter;
    private ArrayList<String> imageUrlList = new ArrayList<>();
    private ArrayList<String> imageTitleList = new ArrayList<>();
    private ArrayList<String> imageTargetUrlList = new ArrayList<>();
    private ImageView mCollectView;

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
    public void onResume() {
        super.onResume();
        homePresenter.getData();
    }

    @Override
    public void bannerData(BannerEntity bannerEntity) {
        if (imageUrlList.size() > 0) {
            imageUrlList.clear();
        }
        if (imageTitleList.size() > 0) {
            imageTitleList.clear();
        }
        if (imageTargetUrlList.size() > 0) {
            imageTargetUrlList.clear();
        }
        for (BannerEntity.DataBean dataBean : bannerEntity.getData()) {
            imageUrlList.add(dataBean.getImagePath());
            imageTitleList.add(dataBean.getTitle());
            imageTargetUrlList.add(dataBean.getUrl());
        }
    }

    @Override
    public void homeData(CommonListEntity commonListEntity, int page) {
        if (page == 0) {
            homeListAdapter = new HomeListAdapter(mContext, commonListEntity.getData().getDatas(), imageUrlList, imageTitleList, imageTargetUrlList);
            rvHome.setAdapter(homeListAdapter);
            homeListAdapter.setOnDetailClickListener(this);
        } else {
            homeListAdapter.addAll(commonListEntity.getData().getDatas());
        }
    }


    @Override
    public void onCollectClickListener(boolean collect, String id, ImageView imageView) {
        this.mCollectView = imageView;
        if (collect) {
            homePresenter.uncollectArticle(id);

        } else {
            homePresenter.collectArtcle(id);
        }
    }

    @Override
    public void collect(CommonCollectEntity commonCollectEntity) {
        if (commonCollectEntity.getErrorCode() == 0) {
            Snackbar.make(rvHome, "收藏成功", Snackbar.LENGTH_SHORT).setAction("知道了", new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            }).show();
            mCollectView.setImageResource(R.drawable.icon_collected);
        }
    }

    @Override
    public void unCollect(CommonCollectEntity commonCollectEntity) {
        if (commonCollectEntity.getErrorCode() == 0) {
            Snackbar.make(rvHome, "取消收藏成功", Snackbar.LENGTH_SHORT).setAction("知道了", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            }).show();
            mCollectView.setImageResource(R.drawable.icon_collect);
        }

    }

    @Override
    public void onDetailClickListener(String url) {
        Intent intent = new Intent(mContext, DetailActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
