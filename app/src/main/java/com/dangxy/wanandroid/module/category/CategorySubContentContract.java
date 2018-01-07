package com.dangxy.wanandroid.module.category;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;
import com.dangxy.wanandroid.entity.CommonListEntity;

/**
 * @author dangxy99
 * @description CategorySubContentContract
 */
public interface CategorySubContentContract {

    interface ICategorySubContentView extends IBaseView {
        void categoryListData(CommonListEntity commonListEntity);
    }

    interface ICategorySubContentPresenter extends IBasePresenter {
    }
}
