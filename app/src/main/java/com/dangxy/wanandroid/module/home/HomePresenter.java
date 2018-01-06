package com.dangxy.wanandroid.module.home;

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
 * @date 2018/1/6
 */

public class HomePresenter implements HomeContract.IHomePresenter, SwipeRefreshLayout.OnRefreshListener, LoadMoreDelegate.LoadMoreSubject {


    private RxHomeService rxHomeService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxHomeService.class);
    private HomeContract.IHomeView iHomeView;

    private SwipeRefreshLayout mSwipeRefreshLayout;
    private RecyclerView mRecyclerView;
    private LoadMoreDelegate loadMoreDelegate;
    private AtomicInteger loadingCount;
    private int page = 0;
    private boolean isRefresh;

    public HomePresenter(HomeContract.IHomeView homeView) {
        this.iHomeView = homeView;
    }

    public void setSwipeRefreshLayout(SwipeRefreshLayout swipeRefreshLayout) {
        this.mSwipeRefreshLayout = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
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
        loadBannerData();
        getHomeData();
    }

    private void loadBannerData() {
        rxHomeService
                .listBanner()
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        iHomeView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<BannerEntity>() {
                    @Override
                    public void accept(BannerEntity bannerEntity) throws Exception {
                        if (mSwipeRefreshLayout.isRefreshing()) {
                            mSwipeRefreshLayout.setRefreshing(false);
                        }
                        iHomeView.hideLoading();
                        iHomeView.bannerData(bannerEntity);
                    }
                });
    }

    private void getHomeData() {
        rxHomeService
                .getHomeList(page)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        notifyLoadingStarted();
                        if (!isRefresh && !isLoading()) {
                            iHomeView.showLoading();
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
                            iHomeView.hideLoading();
                            iHomeView.homeData(commonListEntity, page);

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

        getHomeData();
    }

    public void notifyLoadingStarted() {

        loadingCount.getAndIncrement();
    }


    public void notifyLoadingFinished() {

        loadingCount.decrementAndGet();
    }
}
