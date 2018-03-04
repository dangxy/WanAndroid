package com.dangxy.wanandroid.module.me;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;

/**
 * @author dangxy99
 * @description AddCollectContract
 */
public interface AddCollectContract {

    interface IAddCollectView extends IBaseView {
        void addCollect(AddCollectEntity addCollectEntity);
    }

    interface IAddCollectPresenter extends IBasePresenter {
    }
}
