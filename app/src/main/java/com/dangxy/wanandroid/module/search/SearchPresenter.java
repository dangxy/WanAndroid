package com.dangxy.wanandroid.module.search;

import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.api.RetrofitWanAndroid;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/13
 */

public class SearchPresenter implements  SearchContract.ISearchPresenter {

    private SearchContract.ISearchView iSearchView;

  private RxSearchService rxSearchService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxSearchService.class);

    public SearchPresenter(SearchContract.ISearchView iSearchView) {
        this.iSearchView = iSearchView;
    }

    @Override
    public void getData() {
        getWebsite();
        getHotKey();
    }
    public void getWebsite(){
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
public void getHotKey(){
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



}
