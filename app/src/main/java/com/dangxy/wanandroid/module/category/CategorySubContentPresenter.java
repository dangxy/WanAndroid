package com.dangxy.wanandroid.module.category;

import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.api.RetrofitWanAndroid;
import com.dangxy.wanandroid.entity.CommonListEntity;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class CategorySubContentPresenter implements CategorySubContentContract.ICategorySubContentPresenter {
    private RxCategoryService rxCategoryService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxCategoryService.class);

    private CategorySubContentContract.ICategorySubContentView iCategorySubContentView;
    private int page = 0;
    private String id;

    public CategorySubContentPresenter(CategorySubContentContract.ICategorySubContentView iCategorySubContentView, String id) {
        this.iCategorySubContentView = iCategorySubContentView;
        this.id = id;
    }

    @Override
    public void getData() {
        rxCategoryService.listSubData(page, id)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        iCategorySubContentView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<CommonListEntity>() {
                    @Override
                    public void accept(CommonListEntity commonListEntity) throws Exception {

                        iCategorySubContentView.hideLoading();
                        iCategorySubContentView.categoryListData(commonListEntity);
                    }
                });
    }
}
