package com.dangxy.wanandroid.module.category;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dangxy.wanandroid.R;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/7
 */
public class CategorySubFragment extends Fragment {

    public CategorySubFragment() {
        // Required empty public constructor
    }

    public static CategorySubFragment newInstance(String subId) {

        Bundle args = new Bundle();
        args.putString("subId", subId);
        CategorySubFragment fragment = new CategorySubFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_category_sub, container, false);
    }


}
