package com.dangxy.wanandroid.module.me;


import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
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
public class CollectArticleFragment extends BaseLazyFragment implements CollectArticleContract.ICollectArticleView, CollectArticleAdapter.CollectArticleClickListener {


    @BindView(R.id.rv_me_collect)
    RecyclerView rvMeCollect;
    @BindView(R.id.spl_me_collect)
    SwipeRefreshLayout splMeCollect;
    private CollectArticlePresenter collectArticlePresenter;
    private CollectArticleAdapter collectArticleAdapter;

    public CollectArticleFragment() {
    }



    @Override
    protected void loadData() {
        collectArticlePresenter = new CollectArticlePresenter(this);
        collectArticlePresenter.getData();
        collectArticlePresenter.setRefresh(splMeCollect, rvMeCollect);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_collect_acticle;
    }

    @Override
    protected void initViews() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvMeCollect.setLayoutManager(linearLayoutManager);

    }


    @Override
    public void getCollectArticle(CollectArticleEntity collectArticleEntity, int page) {
        if (page == 0) {
            collectArticleAdapter = new CollectArticleAdapter(mContext,  collectArticleEntity.getData().getDatas());
            rvMeCollect.setAdapter(collectArticleAdapter);
        } else {
            collectArticleAdapter.addAll(collectArticleEntity.getData().getDatas());
        }
        collectArticleAdapter.setOnDetailClickListener(this);
    }

    @Override
    public void onDetailClickListener(String url) {
        Intent intent = new Intent(mContext, DetailActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
