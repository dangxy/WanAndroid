package com.dangxy.wanandroid.module.me;


import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseLazyFragment;
import com.dangxy.wanandroid.utils.SharedPreferencesUtil;

import butterknife.BindView;
import butterknife.OnClick;

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


    @OnClick({R.id.rl_me_collect, R.id.rl_me_setting, R.id.rl_me_about})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_me_collect:
                if (TextUtils.isEmpty(SharedPreferencesUtil.getString("cookie", "" ))) {
                    Toast.makeText(WanAndroidApplication.getmContext(), "请先登录~", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    Intent intent = new Intent(mContext, CollectActivity.class);
                    startActivity(intent);
                }

                break;
            case R.id.rl_me_setting:
                break;
            case R.id.rl_me_about:
                Intent intentAbout = new Intent(mContext, AboutActivity.class);
                startActivity(intentAbout);
                break;
            default:
                break;
        }
    }
}
