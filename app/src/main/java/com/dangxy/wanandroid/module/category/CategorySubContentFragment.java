package com.dangxy.wanandroid.module.category;


import android.os.Bundle;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.utils.MLog;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/7
 */
public class CategorySubContentFragment extends BaseLazyFragment implements CategorySubContentContract.ICategorySubContentView {


    @BindView(R.id.tv_id)
    TextView tvId;
    private String id;
    private CategorySubContentPresenter categorySubContentPresenter;

    public CategorySubContentFragment() {
    }

    public static CategorySubContentFragment newInstance(String subId) {

        Bundle args = new Bundle();
        args.putString("subId", subId);
        CategorySubContentFragment fragment = new CategorySubContentFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void loadData() {

    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_category_sub_content;
    }

    @Override
    protected void initViews() {
        id = getArguments().getString("subId");
        MLog.e("DANG", id+"------");
        tvId.setText(id);
        categorySubContentPresenter = new CategorySubContentPresenter(this, id);
        categorySubContentPresenter.getData();


    }

    @Override
    public void categoryListData(CommonListEntity commonListEntity) {

        // tvId.setText(commonListEntity.getData().getDatas().get(0).getChapterName());

    }
}
