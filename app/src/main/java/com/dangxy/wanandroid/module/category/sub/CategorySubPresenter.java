package com.dangxy.wanandroid.module.category.sub;

import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.api.RetrofitWanAndroid;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.module.category.RxCategoryService;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class CategorySubPresenter implements CategorySubContract.ICategorySubPresenter {
    private CategorySubContract.ICategorySubView iCategorySubView;
    private RxCategoryService rxCategoryService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxCategoryService.class);
    private String id;
    private int page = 0;

    public CategorySubPresenter(CategorySubContract.ICategorySubView iCategorySubView, String id) {
        this.iCategorySubView = iCategorySubView;
        this.id = id;
    }

    @Override
    public void getData() {
        rxCategoryService.listSubData(page, id)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        iCategorySubView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CommonListEntity>() {
                    @Override
                    public void accept(CommonListEntity commonListEntity) throws Exception {

                        iCategorySubView.hideLoading();
                        iCategorySubView.categoryListData(commonListEntity);
                    }
                });
    }
}
