package com.dangxy.wanandroid.module.me;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseActivity;
import com.dangxy.wanandroid.utils.MLog;
import com.dangxy.wanandroid.utils.SharedPreferencesUtil;

import butterknife.BindView;
import butterknife.OnClick;

public class AboutActivity extends BaseActivity {


    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.iv_image_system)
    ImageView ivImageSystem;
    @BindView(R.id.tv_version_name)
    TextView tvVersionName;
    @BindView(R.id.rl_about_weixin)
    RelativeLayout rlAboutWeixin;
    @BindView(R.id.rl_about_sina)
    RelativeLayout rlAboutSina;

    @Override
    protected void initView() {
        MLog.e("DANG",(SharedPreferencesUtil.getString("cookie", "")+"+++"));
        if (!TextUtils.isEmpty(SharedPreferencesUtil.getString("cookie", ""))) {
            findViewById(R.id.tv_login_out).setVisibility(View.VISIBLE);
        }else{
            findViewById(R.id.tv_login_out).setVisibility(View.GONE);
        }

        findViewById(R.id.tv_login_out).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!TextUtils.isEmpty(SharedPreferencesUtil.getString("cookie", ""))) {

                    SharedPreferencesUtil.removeValue("cookie");
                      MLog.e("DANG",(SharedPreferencesUtil.getString("cookie", "")+"---"));
                }
            }
        });
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_about;
    }


    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }
}
