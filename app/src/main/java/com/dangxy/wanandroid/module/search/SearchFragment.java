package com.dangxy.wanandroid.module.search;


import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.entity.CommonListEntity;
import com.dangxy.wanandroid.module.detail.DetailActivity;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/13
 */
public class SearchFragment extends BaseLazyFragment implements SearchContract.ISearchView {


    @BindView(R.id.et_search_content)
    TextView etSearchContent;
    @BindView(R.id.iv_search_delete)
    ImageView ivSearchDelete;
    @BindView(R.id.tfl_search)
    TagFlowLayout tflSearch;
    @BindView(R.id.tfl_hot)
    TagFlowLayout tflHot;
    private ArrayList<String> websitesList;
    private ArrayList<String> websitesListIds;
    private ArrayList<String> hotkeyList;
    private ArrayList<String> hotkeyListIds;
    private ArrayList<Integer> colorList;
    private SearchPresenter searchPresenter;
    private LayoutInflater mInflater;

    public SearchFragment() {
    }


    @Override
    protected void loadData() {
        searchPresenter = new SearchPresenter(this);
        searchPresenter.getData();
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_search;
    }

    @Override
    protected void initViews() {
        mInflater = LayoutInflater.from(mContext);
        websitesList = new ArrayList<>();
        hotkeyList = new ArrayList<>();
        hotkeyListIds=new ArrayList<>();
        websitesListIds = new ArrayList<>();
        colorList = new ArrayList<>();
        colorList.add(Color.parseColor("#1296db"));
        colorList.add(Color.parseColor("#d4237a"));
        colorList.add(Color.parseColor("#d81e06"));
        colorList.add(Color.parseColor("#2c2c2c"));
        colorList.add(Color.parseColor("#13227a"));
        colorList.add(Color.parseColor("#1afa29"));
        etSearchContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext,SearchActivity.class);
                startActivity(intent);
            }
        });
    }


    @Override
    public void getWebsite(final WebsitesEntity websitesEntity) {
        for (int i = 0; i < websitesEntity.getData().size(); i++) {
            websitesList.add(websitesEntity.getData().get(i).getName());
            websitesListIds.add(websitesEntity.getData().get(i).getLink());
        }
        tflSearch.setAdapter(new TagAdapter<String>(websitesList) {
            @Override
            public View getView(FlowLayout parent, int position, String o) {
                TextView tv = (TextView) mInflater.inflate(R.layout.tv,
                        tflSearch, false);
                tv.setText(o);
                tv.setTextColor(colorList.get(getRandomIntNum(0, colorList.size() - 1)));
                return tv;
            }
        });
        tflSearch.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                String title = websitesListIds.get(position);
                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("url", title);
                startActivity(intent);

                return true;
            }
        });
    }

    @Override
    public void getHotKey(HotKeyEntity hotKeyEntity) {
        for (int i = 0; i < hotKeyEntity.getData().size(); i++) {
            hotkeyList.add(hotKeyEntity.getData().get(i).getName());
            hotkeyListIds.add(hotKeyEntity.getData().get(i).getName());
        }
        tflHot.setAdapter(new TagAdapter<String>(hotkeyList) {
            @Override
            public View getView(FlowLayout parent, int position, String o) {
                TextView tv = (TextView) mInflater.inflate(R.layout.tv,
                        tflSearch, false);
                tv.setText(o);
                tv.setTextColor(colorList.get(getRandomIntNum(0, colorList.size() - 1)));
                return tv;
            }
        });
        tflHot.setOnTagClickListener(new TagFlowLayout.OnTagClickListener() {
            @Override
            public boolean onTagClick(View view, int position, FlowLayout parent) {
                String title = hotkeyListIds.get(position);

                Intent intent = new Intent(mContext,SearchActivity.class);
                intent.putExtra("key",title);
                startActivity(intent);
                return true;
            }
        });
    }

    public static int getRandomIntNum(int min, int max) {
        Random rdm = new Random();
        return rdm.nextInt(max - min + 1) + min;
    }

    @Override
    public void getSearchKey(CommonListEntity commonListEntity) {

    }
}