package com.dangxy.wanandroid.module.me;

import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.WanAndroidApplication;
import com.dangxy.wanandroid.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;
/**
 * @description  描述
 * @author  dangxy99
 * @date   2018/3/4
 */
public class AddCollectActivity extends BaseActivity implements AddCollectContract.IAddCollectView {

    @BindView(R.id.iv_add_collect_back)
    ImageView ivAddCollectBack;
    @BindView(R.id.tv_add_collect_add)
    TextView tvAddCollectAdd;
    @BindView(R.id.et_add_collect_name)
    EditText etAddCollectName;
    @BindView(R.id.et_add_collect_url)
    EditText etAddCollectUrl;
    private AddCollectPresenter addCollectPresenter;

    @Override
    protected void initView() {

        addCollectPresenter = new AddCollectPresenter(this);



    }

    @Override
    protected int attachLayoutRes() {

        return R.layout.activity_add_collect;
    }

    @OnClick({R.id.iv_add_collect_back, R.id.tv_add_collect_add})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_add_collect_back:
                finish();
                break;
            case R.id.tv_add_collect_add:
                if(TextUtils.isEmpty(etAddCollectName.getText().toString())||TextUtils.equals("",etAddCollectName.getText().toString())){
                    Toast.makeText(WanAndroidApplication.getmContext(),"名称不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(etAddCollectUrl.getText().toString())||TextUtils.equals("",etAddCollectUrl.getText().toString())){
                    Toast.makeText(WanAndroidApplication.getmContext(),"地址不能为空",Toast.LENGTH_SHORT).show();
                    return;
                }
                addCollectPresenter.addCollect(etAddCollectName.getText().toString(),etAddCollectUrl.getText().toString());
                break;
            default:
                break;
        }
    }

    @Override
    public void addCollect(AddCollectEntity addCollectEntity) {

        if(addCollectEntity.getErrorCode()==0){
            Snackbar.make(tvAddCollectAdd, "添加收藏成功", Snackbar.LENGTH_SHORT).setAction("OK", new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            }).show();
            finish();
        }

    }
}
