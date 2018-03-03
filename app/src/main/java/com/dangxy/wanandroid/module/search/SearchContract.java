package com.dangxy.wanandroid.module.search;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;
import com.dangxy.wanandroid.entity.CommonListEntity;

/**
 * @author dangxy99
 * @description SearchContract
 */
public interface SearchContract {

    interface ISearchView extends IBaseView {
        void getWebsite(WebsitesEntity websitesEntity);

        void getHotKey(HotKeyEntity hotKeyEntity);

        void getSearchKey(CommonListEntity commonListEntity);
    }

    interface ISearchPresenter extends IBasePresenter {
    }
}
