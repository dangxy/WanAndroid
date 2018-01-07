package com.dangxy.wanandroid.module.category;

import com.dangxy.wanandroid.base.IBasePresenter;
import com.dangxy.wanandroid.base.IBaseView;

/**
 * @author dangxy99
 * @description CategoryContract
 */
public interface CategoryContract {

    interface ICategoryView extends IBaseView {
        void categoryData(CategoryEntity categoryEntity);
    }

    interface ICategoryPresenter extends IBasePresenter {
    }
}
