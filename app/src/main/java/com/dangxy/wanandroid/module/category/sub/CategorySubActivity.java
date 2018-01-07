package com.dangxy.wanandroid.module.category.sub;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseActivity;
import com.dangxy.wanandroid.entity.CommonListEntity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/7
 */
public class CategorySubActivity extends BaseActivity implements CategorySubContract.ICategorySubView {


    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.rv_category_sub)
    RecyclerView rvCategorySub;
    private String id;
    private String title;
    private CategorySubPresenter categorySubPresenter;

    @Override
    protected void initView() {
        title = getIntent().getStringExtra("title");
        id = getIntent().getStringExtra("id");
        tvTitle.setText(title);
        categorySubPresenter = new CategorySubPresenter(this, id);
        categorySubPresenter.getData();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvCategorySub.setLayoutManager(linearLayoutManager);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_category_sub;
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }

    @Override
    public void categoryListData(CommonListEntity commonListEntity) {
        CategorySubAdapter categorySubAdapter = new CategorySubAdapter(mContext, commonListEntity.getData().getDatas());
        rvCategorySub.setAdapter(categorySubAdapter);
    }
}
