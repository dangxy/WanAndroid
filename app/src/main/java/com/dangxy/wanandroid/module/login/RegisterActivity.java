package com.dangxy.wanandroid.module.login;

import android.content.Intent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/3/4
 */
public class RegisterActivity extends BaseActivity implements LoginContract.ILoginView {


    @BindView(R.id.register_username)
    AutoCompleteTextView registerUsername;
    @BindView(R.id.register_password)
    EditText registerPassword;
    @BindView(R.id.register_rePassword)
    EditText registerRePassword;
    @BindView(R.id.email_sign_in_button)
    Button emailSignInButton;
    @BindView(R.id.tv_register_login)
    TextView tvRegisterLogin;
    private LoginPresenter loginPresenter;

    @Override
    protected void initView() {

         loginPresenter = new LoginPresenter(this);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_register;
    }


    @OnClick({R.id.email_sign_in_button, R.id.tv_register_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.email_sign_in_button:
                loginPresenter.register(registerUsername.getText().toString(),registerPassword.getText().toString(),registerRePassword.getText().toString());
                break;
            case R.id.tv_register_login:
                Intent intent = new Intent(mContext, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
            default:
                break;
        }
    }

    @Override
    public void loginWithPassword(LoginEntity loginEntity) {

    }

    @Override
    public void register(LoginEntity loginEntity) {
        if(loginEntity.getErrorCode()==0){
            finish();
        }
    }
}
