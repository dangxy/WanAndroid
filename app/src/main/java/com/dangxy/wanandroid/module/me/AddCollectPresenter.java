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
 * @date 2018/3/4
 */

public class AddCollectPresenter  implements AddCollectContract.IAddCollectPresenter {

    private RxAddCollectService rxAddCollectService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxAddCollectService.class);

    private AddCollectContract.IAddCollectView mIAddCollectView;

    public AddCollectPresenter(AddCollectContract.IAddCollectView iAddCollectView) {
        this.mIAddCollectView = iAddCollectView;
    }

    @Override
    public void getData() {

    }

    public void addCollect(String name,String link){
        rxAddCollectService.addCollectWebsites(name,link)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        mIAddCollectView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<AddCollectEntity>() {
                    @Override
                    public void accept(AddCollectEntity addCollectEntity) throws Exception {

                        mIAddCollectView.hideLoading();
                        mIAddCollectView.addCollect(addCollectEntity);

                    }
                });
    }
}
