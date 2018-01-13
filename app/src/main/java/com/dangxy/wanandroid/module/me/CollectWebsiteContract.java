package com.dangxy.wanandroid.module.me;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;

/**
 * @author dangxy99
 * @description CollectWebsiteContract
 */
public interface CollectWebsiteContract {

    interface ICollectWebsiteView extends IBaseView {
        void getCollectWebsites(CollectWebsiteEntity collectWebsiteEntity);
    }

    interface ICollectWebsitePresenter extends IBasePresenter {
    }
}
