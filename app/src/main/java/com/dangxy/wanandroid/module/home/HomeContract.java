package com.dangxy.wanandroid.module.home;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;
import com.dangxy.wanandroid.entity.CommonListEntity;

/**
 * @author dangxy99
 * @description HomeContract
 */
public interface HomeContract {

    interface IHomeView extends IBaseView {
        void bannerData(BannerEntity bannerEntity);

        void homeData(CommonListEntity commonListEntity, int page);
    }

    interface IHomePresenter extends IBasePresenter {
    }
}
