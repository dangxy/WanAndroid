package com.dangxy.wanandroid.module.me;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.api.RetrofitWanAndroid;
import com.dangxy.wanandroid.utils.LoadMoreDelegate;

import java.util.concurrent.atomic.AtomicInteger;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public class CollectArticlePresenter implements CollectArticleContract.ICollectArticlePresenter, SwipeRefreshLayout.OnRefreshListener, LoadMoreDelegate.LoadMoreSubject {
    private RxMeService rxMeService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxMeService.class);

    private CollectArticleContract.ICollectArticleView iCollectArticleView;
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private LoadMoreDelegate loadMoreDelegate;
    private AtomicInteger loadingCount;
    private int page = 0;
    private boolean isRefresh;
    public CollectArticlePresenter(CollectArticleContract.ICollectArticleView iCollectArticleView) {
        this.iCollectArticleView = iCollectArticleView;
    }

    public void setRefresh(SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        this.mSwipeRefreshLayout = swipeRefreshLayout;
        this.mRecyclerView = recyclerView;
        mSwipeRefreshLayout.setOnRefreshListener(this);
        loadMoreDelegate = new LoadMoreDelegate(this);
        loadMoreDelegate.attach(mRecyclerView);
        loadingCount = new AtomicInteger(0);
    }
    @Override
    public void getData() {
        rxMeService.getcollectArticles(page)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        notifyLoadingStarted();
                        if (!isRefresh && !isLoading()) {
                            iCollectArticleView.showLoading();
                        }
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CollectArticleEntity>() {
                    @Override
                    public void accept(CollectArticleEntity collectArticleEntity) throws Exception {
                        notifyLoadingFinished();
                        if (isRefresh) {
                            mSwipeRefreshLayout.setRefreshing(false);
                            isRefresh = false;
                        } else {
                            iCollectArticleView.hideLoading();
                            iCollectArticleView.getCollectArticle(collectArticleEntity, page);

                        }
                        page++;
                    }
                });


    }

    @Override
    public void onRefresh() {
        isRefresh = true;
        page=0;
        getData();
    }

    @Override
    public boolean isLoading() {
        return loadingCount.get() > 0;
    }

    @Override
    public void onLoadMore() {

        getData();
    }

    public void notifyLoadingStarted() {

        loadingCount.getAndIncrement();
    }


    public void notifyLoadingFinished() {

        loadingCount.decrementAndGet();
    }
}
