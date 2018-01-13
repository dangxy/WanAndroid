package com.dangxy.wanandroid.module.search;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.api.RetrofitWanAndroid;
import com.dangxy.wanandroid.entity.CommonListEntity;
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

public class SearchPresenter implements  SearchContract.ISearchPresenter, SwipeRefreshLayout.OnRefreshListener, LoadMoreDelegate.LoadMoreSubject {

    private SearchContract.ISearchView iSearchView;

  private RxSearchService rxSearchService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxSearchService.class);
    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private LoadMoreDelegate loadMoreDelegate;
    private AtomicInteger loadingCount;
    private int page = 0;
    private boolean isRefresh;
    private String mKeyWords;
    public SearchPresenter(SearchContract.ISearchView iSearchView) {
        this.iSearchView = iSearchView;
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

    }
    public void searchArticle(String keyWords){
       this.mKeyWords = keyWords;
        rxSearchService
                .getSearchListData( page,keyWords)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        notifyLoadingStarted();
                        if (!isRefresh && !isLoading()) {
                            iSearchView.showLoading();
                        }
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CommonListEntity>() {
                    @Override
                    public void accept(CommonListEntity commonListEntity) throws Exception {
                        notifyLoadingFinished();
                        if (isRefresh) {
                            mSwipeRefreshLayout.setRefreshing(false);
                            isRefresh = false;
                        } else {
                            iSearchView.hideLoading();
                            iSearchView.searchListData(commonListEntity, page);

                        }
                        page++;
                    }
                });
    }
    @Override
    public boolean isLoading() {
        return loadingCount.get() > 0;
    }

    @Override
    public void onLoadMore() {

        searchArticle(mKeyWords);
    }

    public void notifyLoadingStarted() {

        loadingCount.getAndIncrement();
    }


    public void notifyLoadingFinished() {

        loadingCount.decrementAndGet();
    }

    @Override
    public void onRefresh() {
        isRefresh = true;
        page=0;
        searchArticle(mKeyWords);
    }
}
