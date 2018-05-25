package com.dangxy.wanandroid.module.search;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseActivity;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.module.category.sub.CategorySubAdapter;
import com.dangxy.wanandroid.module.detail.DetailActivity;
import com.dangxy.wanandroid.module.room.SearchDataBase;
import com.dangxy.wanandroid.module.room.SearchEntity;

import java.util.List;

import butterknife.BindView;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/3/3
 */
public class SearchActivity extends BaseActivity implements SearchContract.ISearchView, CategorySubAdapter.CategorySubClickListener {


    @BindView(R.id.et_search_content)
    EditText etSearchContent;
    @BindView(R.id.iv_search_delete)
    ImageView ivSearchDelete;
    @BindView(R.id.rlv_search_result)
    RecyclerView rlvSearchResult;
    @BindView(R.id.rlv_search_history)
    RecyclerView rlvSearchHistory;
    private int page = 0;
    private SearchPresenter searchPresenter;
    private CategorySubAdapter categorySubAdapter;
    private String key;
    private SearchDataBase searchDataBase;
    private SearchHistoryAdapter searchHistoryAdapter;

    @Override
    protected void initView() {
        searchPresenter = new SearchPresenter(this);
        key = getIntent().getStringExtra("key");

        if(key!=null){
            etSearchContent.setText(key);
            etSearchContent.setFocusable(false);
            searchPresenter.getSearchKey(key, page);


        }
        searchDataBase =   Room.databaseBuilder(this, SearchDataBase.class,"search-data").build();


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rlvSearchHistory.setLayoutManager(linearLayoutManager);

        searchAll();
        etSearchContent.setOnEditorActionListener(new TextView.OnEditorActionListener() {

            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    InputMethodManager imm = (InputMethodManager) v
                            .getContext().getSystemService(
                                    Context.INPUT_METHOD_SERVICE);
                    if (imm.isActive()) {
                        imm.hideSoftInputFromWindow(
                                v.getApplicationWindowToken(), 0);
                    }
                    if (!TextUtils.isEmpty(etSearchContent.getText().toString())) {
                        searchPresenter.getSearchKey(etSearchContent.getText().toString(), page);
                        CompositeDisposable compositeDisposable = new CompositeDisposable();
                        compositeDisposable.add(Observable.just(1)

                                .subscribeOn(Schedulers.io())
                                .observeOn(Schedulers.newThread())
                                .subscribe(new Consumer<Integer>() {
                                    @Override
                                    public void accept(Integer integer) throws Exception {
                                        SearchEntity searchEntity = new SearchEntity(etSearchContent.getText().toString(),"1");
                                        searchDataBase.searchDao().addSearch(searchEntity);
                                    }
                                }));
                        compositeDisposable.dispose();



                    } else {
                        Toast.makeText(WanAndroidApplication.getmContext(), "请输入要搜索的名字~", Toast.LENGTH_SHORT).show();
                        return true;
                    }

                    return true;
                }
                return false;
            }
        });
        etSearchContent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    ivSearchDelete.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        ivSearchDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etSearchContent.setText("");
                rlvSearchResult.setVisibility(View.GONE);
                ivSearchDelete.setVisibility(View.GONE);
                rlvSearchHistory.setVisibility(View.VISIBLE);

            }
        });
        LinearLayoutManager linearLayoutManagerResult = new LinearLayoutManager(WanAndroidApplication.getmContext());
        linearLayoutManagerResult.setOrientation(LinearLayoutManager.VERTICAL);
        rlvSearchResult.setLayoutManager(linearLayoutManagerResult);
    }

    private void searchAll() {

        searchDataBase.searchDao().findAllSearch()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Consumer<List<SearchEntity>>() {
                    @Override
                    public void accept(List<SearchEntity> searchEntities) throws Exception {

                        if(searchEntities.size()>0){
                            rlvSearchHistory.setVisibility(View.VISIBLE);
                            rlvSearchResult.setVisibility(View.GONE);
                            searchHistoryAdapter =  new SearchHistoryAdapter(searchEntities);
                            rlvSearchHistory.setAdapter(searchHistoryAdapter);
                            searchHistoryAdapter.setOnDetailClickListener(new SearchHistoryAdapter.SearchClickListener() {
                                @Override
                                public void onDetailClickListener(SearchEntity entity) {
                                    etSearchContent.setText(entity.getName());
                                    searchPresenter.getSearchKey(entity.getName(),page);
                                    rlvSearchHistory.setVisibility(View.GONE);
                                    rlvSearchResult.setVisibility(View.VISIBLE);
                                }
                            });
                        }
                    }
                });

    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_search;
    }

    @Override
    public void getWebsite(WebsitesEntity websitesEntity) {

    }

    @Override
    public void getHotKey(HotKeyEntity hotKeyEntity) {

    }

    @Override
    public void getSearchKey(CommonListEntity commonListEntity) {
        rlvSearchResult.setVisibility(View.VISIBLE);
        rlvSearchHistory.setVisibility(View.GONE);
        if (page == 0) {
            categorySubAdapter = new CategorySubAdapter(mContext, commonListEntity.getData().getDatas());
            rlvSearchResult.setAdapter(categorySubAdapter);
            categorySubAdapter.setOnDetailClickListener(this);
            searchPresenter.setRefresh(rlvSearchResult);
            page = 1;
        } else {
            categorySubAdapter.addAll(commonListEntity.getData().getDatas());
        }

    }

    @Override
    public void onDetailClickListener(String url) {
        Intent intent = new Intent(mContext, DetailActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }
}
