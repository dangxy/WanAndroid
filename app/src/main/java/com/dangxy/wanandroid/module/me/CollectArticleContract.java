package com.dangxy.wanandroid.module.me;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;

/**
 * @author dangxy99
 * @description CollectArticleContract
 */
public interface CollectArticleContract {

    interface ICollectArticleView extends IBaseView {
        void getCollectArticle(CollectArticleEntity collectArticleEntity, int page);
    }

    interface ICollectArticlePresenter extends IBasePresenter {
    }
}
