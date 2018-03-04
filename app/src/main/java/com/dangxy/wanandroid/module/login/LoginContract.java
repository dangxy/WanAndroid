package com.dangxy.wanandroid.module.login;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;

/**
 * @author dangxy99
 * @description LoginContract
 */
public interface LoginContract {

    interface ILoginView extends IBaseView {
        /**
         * login with password
         * @param loginEntity
         */
        void loginWithPassword(LoginEntity loginEntity);

        void register(LoginEntity loginEntity);
    }

    interface ILoginPresenter extends IBasePresenter {
    }
}
