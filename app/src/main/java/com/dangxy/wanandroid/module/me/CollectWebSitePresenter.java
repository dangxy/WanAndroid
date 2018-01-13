package com.dangxy.wanandroid.module.me;

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

public class CollectWebSitePresenter implements  CollectWebsiteContract.ICollectWebsitePresenter{
    private RxMeService rxMeService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxMeService.class);

    private CollectWebsiteContract.ICollectWebsiteView iCollectWebsiteView;

    public CollectWebSitePresenter(CollectWebsiteContract.ICollectWebsiteView iCollectWebsiteView) {
        this.iCollectWebsiteView = iCollectWebsiteView;
    }

    @Override
    public void getData() {
        rxMeService.getcollectWebsites()
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        iCollectWebsiteView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CollectWebsiteEntity>() {
                    @Override
                    public void accept(CollectWebsiteEntity collectWebsiteEntity) throws Exception {

                            iCollectWebsiteView.hideLoading();
                        iCollectWebsiteView.getCollectWebsites(collectWebsiteEntity);

                    }
                });
    }
}
