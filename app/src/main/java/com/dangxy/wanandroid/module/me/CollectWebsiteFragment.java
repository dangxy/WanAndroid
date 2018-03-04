package com.dangxy.wanandroid.module.me;


import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.module.detail.DetailActivity;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/13
 */
public class CollectWebsiteFragment extends BaseLazyFragment implements CollectWebsiteContract.ICollectWebsiteView, CollectWebsiteAdapter.CollectWebsiteClickListener {


    @BindView(R.id.rv_me_website)
    RecyclerView rvMeWebsite;
    private CollectWebSitePresenter collectWebSitePresenter;
    private CollectWebsiteAdapter collectWebsiteAapter;

    public CollectWebsiteFragment() {
    }


    @Override
    protected void loadData() {

        collectWebSitePresenter = new CollectWebSitePresenter(this);
        collectWebSitePresenter.getData();

    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_collect_website;
    }

    @Override
    protected void initViews() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvMeWebsite.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void getCollectWebsites(CollectWebsiteEntity collectWebsiteEntity) {
        collectWebsiteAapter = new CollectWebsiteAdapter(mContext,  collectWebsiteEntity.getData());
        rvMeWebsite.setAdapter(collectWebsiteAapter);
        collectWebsiteAapter.setOnDetailClickListener(this);
    }


    @Override
    public void onDetailClickListener(String url) {
        Intent intent = new Intent(mContext, DetailActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
