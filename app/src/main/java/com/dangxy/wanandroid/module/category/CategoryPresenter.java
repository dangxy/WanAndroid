package com.dangxy.wanandroid.module.category;

import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.api.RetrofitWanAndroid;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author dangxueyi
 * @description
 * @date 2018/1/7
 */

public class CategoryPresenter implements CategoryContract.ICategoryPresenter {
    private RxCategoryService rxCategoryService = new RetrofitWanAndroid().newInstance(WanAndroidApplication.getmContext()).create(RxCategoryService.class);
    private CategoryContract.ICategoryView iCategoryView;

    public CategoryPresenter(CategoryContract.ICategoryView iCategoryView) {
        this.iCategoryView = iCategoryView;
    }

    @Override
    public void getData() {
      rxCategoryService.listTreeData()
              .subscribeOn(Schedulers.io())
              .doOnSubscribe(new Consumer<Disposable>() {
                  @Override
                  public void accept(Disposable disposable) throws Exception {
                      iCategoryView.showLoading();
                  }
              })
              .subscribeOn(AndroidSchedulers.mainThread())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(new Consumer<CategoryEntity>() {
                  @Override
                  public void accept(CategoryEntity categoryEntity) throws Exception {

                      iCategoryView.hideLoading();
                      iCategoryView.categoryData(categoryEntity);
                  }
              });
    }
}
