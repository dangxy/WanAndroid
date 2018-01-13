package com.dangxy.wanandroid.module.me;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dangxy.wanandroid.R;

/**
 * @description  描述
 * @author  dangxy99
 * @date   2018/1/13
 */
public class CollectWebsiteFragment extends Fragment {


    public CollectWebsiteFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_collect_website, container, false);
    }

}
