package com.dangxy.wanandroid.module.search;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;

/**
 * @author dangxy99
 * @description SearchContract
 */
public interface SearchContract {

    interface ISearchView extends IBaseView {
        void getWebsite(WebsitesEntity websitesEntity);

        void getHotKey(HotKeyEntity hotKeyEntity);
    }

    interface ISearchPresenter extends IBasePresenter {
    }
}
