package com.dangxy.wanandroid.module.search;

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

public class SearchPresenter implements SearchContract.ISearchPresenter, LoadMoreDelegate.LoadMoreSubject {

    private SearchContract.ISearchView iSearchView;

    private RxSearchService rxSearchService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxSearchService.class);
    private LoadMoreDelegate loadMoreDelegate;
    private RecyclerView mRecyclerView;
    private AtomicInteger loadingCount;
    private int mPage = 0;
    private String mKey;

    public SearchPresenter(SearchContract.ISearchView iSearchView) {
        this.iSearchView = iSearchView;
    }

    @Override
    public void getData() {
        getWebsite();
        getHotKey();
    }

    public void setRefresh(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        loadMoreDelegate = new LoadMoreDelegate(this);
        loadMoreDelegate.attach(mRecyclerView);
        loadingCount = new AtomicInteger(0);
    }

    public void getWebsite() {
        rxSearchService
                .getWebsite()
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        iSearchView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<WebsitesEntity>() {
                    @Override
                    public void accept(WebsitesEntity websitesEntity) throws Exception {
                        iSearchView.hideLoading();
                        iSearchView.getWebsite(websitesEntity);
                    }
                });
    }

    public void getHotKey() {
        rxSearchService
                .getHotKey()
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        iSearchView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HotKeyEntity>() {
                    @Override
                    public void accept(HotKeyEntity hotKeyEntity) throws Exception {
                        iSearchView.hideLoading();
                        iSearchView.getHotKey(hotKeyEntity);
                    }
                });
    }

    public void getSearchKey(String key, int page) {
        this.mKey = key;
        this.mPage= page;
        rxSearchService
                .getSearchListData(page, key)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        notifyLoadingStarted();
                        iSearchView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CommonListEntity>() {
                    @Override
                    public void accept(CommonListEntity commonListEntity) throws Exception {
                        notifyLoadingFinished();
                        iSearchView.hideLoading();
                        iSearchView.getSearchKey(commonListEntity);
                        mPage++;

                    }

                });
    }


    @Override
    public boolean isLoading() {
        return loadingCount.get() > 0;
    }

    @Override
    public void onLoadMore() {

        getSearchKey(mKey, mPage);
    }

    public void notifyLoadingStarted() {

        //loadingCount.getAndIncrement();
    }


    public void notifyLoadingFinished() {

        //loadingCount.decrementAndGet();
    }
}
