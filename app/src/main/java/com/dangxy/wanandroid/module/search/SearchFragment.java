package com.dangxy.wanandroid.module.search;


import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.module.category.sub.CategorySubAdapter;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/13
 */
public class SearchFragment extends BaseLazyFragment implements SearchContract.ISearchView {


    @BindView(R.id.et_search_content)
    EditText etSearchContent;
    @BindView(R.id.iv_search_delete)
    ImageView ivSearchDelete;
    @BindView(R.id.rv_search)
    RecyclerView rvSearch;
    @BindView(R.id.srl_search)
    SwipeRefreshLayout srlSearch;

    private SearchPresenter searchPresenter;
    private CategorySubAdapter categorySubAdapter;

    public SearchFragment() {
    }


    @Override
    protected void loadData() {
        searchPresenter = new SearchPresenter(this);
        searchPresenter.getData();
        searchPresenter.setRefresh(srlSearch, rvSearch);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_search;
    }

    @Override
    protected void initViews() {
        etSearchContent.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                InputMethodManager imm = (InputMethodManager) textView
                        .getContext().getSystemService(
                                Context.INPUT_METHOD_SERVICE);
                if (imm.isActive()) {
                    imm.hideSoftInputFromWindow(
                            textView.getApplicationWindowToken(), 0);
                }
                if (!TextUtils.isEmpty(etSearchContent.getText().toString())) {
                    searchPresenter.searchArticle(etSearchContent.getText().toString());
                } else {
                    Toast.makeText(mContext, "请输入要搜索的名字~", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }

        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rvSearch.setLayoutManager(linearLayoutManager);
    }

    @Override
    public void searchListData(CommonListEntity commonListEntity, int page) {
        if (page == 0) {
            categorySubAdapter = new CategorySubAdapter(mContext, commonListEntity.getData().getDatas());
            rvSearch.setAdapter(categorySubAdapter);
        } else {
            categorySubAdapter.addAll(commonListEntity.getData().getDatas());
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser) {
            etSearchContent.setFocusable(true);
            etSearchContent.setFocusableInTouchMode(true);
            etSearchContent.requestFocus();
            getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
}