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
        void searchListData(CommonListEntity commonListEntity, int page);
    }

    interface ISearchPresenter extends IBasePresenter {
    }
}
