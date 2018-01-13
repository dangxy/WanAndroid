package com.dangxy.wanandroid.module.me;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseLazyFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/13
 */
public class MeFragment extends BaseLazyFragment {


    @BindView(R.id.iv_me_collect)
    ImageView ivMeCollect;
    @BindView(R.id.rl_me_collect)
    RelativeLayout rlMeCollect;
    @BindView(R.id.iv_me_setting)
    ImageView ivMeSetting;
    @BindView(R.id.rl_me_setting)
    RelativeLayout rlMeSetting;
    Unbinder unbinder;

    public MeFragment() {
    }


    @Override
    protected void loadData() {

    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_me;
    }

    @Override
    protected void initViews() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.rl_me_collect, R.id.rl_me_setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_me_collect:
                Intent intent = new Intent(mContext,CollectActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_me_setting:
                break;
            default:
                break;
        }
    }
}
