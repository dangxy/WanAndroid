package com.dangxy.wanandroid.module.login;

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

public class LoginPresenter implements LoginContract.ILoginPresenter {

    private RxLoginService rxLoginService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxLoginService.class);


    private LoginContract.ILoginView iLoginView;

    public LoginPresenter(LoginContract.ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void getData() {

    }

    public void login(String username,String password){
        rxLoginService.loginWithPassword(username,password)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {

                            iLoginView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LoginEntity>() {
                    @Override
                    public void accept(LoginEntity loginEntity) throws Exception {
                        iLoginView.hideLoading();
                        iLoginView.loginWithPassword(loginEntity);

                    }
                });
    }  public void register(String username,String password,String rePassword){
        rxLoginService.register(username,password,rePassword)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {

                            iLoginView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<LoginEntity>() {
                    @Override
                    public void accept(LoginEntity loginEntity) throws Exception {
                        iLoginView.hideLoading();
                        iLoginView.register(loginEntity);

                    }
                });
    }
}
