package com.dangxy.wanandroid.module.category.sub;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.module.category.TreeEntity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/7
 */
public class CategorySubFragment extends BaseLazyFragment implements CategorySubListAdapter.DetailClickListener {

    @BindView(R.id.rv_sub)
    RecyclerView rvSub;
    private ArrayList<TreeEntity> subId;

    public CategorySubFragment() {
    }

    public static CategorySubFragment newInstance(List<TreeEntity> subId) {

        Bundle args = new Bundle();
        args.putParcelableArrayList("subId", (ArrayList) subId);
        CategorySubFragment fragment = new CategorySubFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected void loadData() {

    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_category_sub;
    }

    @Override
    protected void initViews() {
        subId = getArguments().getParcelableArrayList("subId");
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvSub.setLayoutManager(linearLayoutManager);
        CategorySubListAdapter categorySubListAdapter = new CategorySubListAdapter(subId);
        rvSub.setAdapter(categorySubListAdapter);
        categorySubListAdapter.setOnDetailClickListener(this);
    }


    @Override
    public void onDetailClickListener(String title, String id) {
        Intent intent = new Intent(mContext,CategorySubActivity.class);
        intent.putExtra("title",title);
        intent.putExtra("id",id);
        startActivity(intent);
    }
}
