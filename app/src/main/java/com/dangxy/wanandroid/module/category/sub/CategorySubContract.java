package com.dangxy.wanandroid.module.category.sub;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;
import com.dangxy.wanandroid.entity.CommonListEntity;

/**
 * @author dangxy99
 * @description CategorySubContract
 */
public interface CategorySubContract {

    interface ICategorySubView extends IBaseView {
        void categoryListData(CommonListEntity commonListEntity);
    }

    interface ICategorySubPresenter extends IBasePresenter {
    }
}
