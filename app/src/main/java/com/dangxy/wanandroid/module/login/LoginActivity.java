package com.dangxy.wanandroid.module.login;

import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author dangxy99
 * @description 描述
 * @date 2018/1/13
 */
public class LoginActivity extends BaseActivity implements LoginContract.ILoginView {


    @BindView(R.id.email)
    AutoCompleteTextView email;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.email_sign_in_button)
    Button emailSignInButton;
    @BindView(R.id.email_login_form)
    LinearLayout emailLoginForm;
    @BindView(R.id.login_form)
    ScrollView loginForm;
    private LoginPresenter loginPresenter;

    @Override
    protected void initView() {
        loginPresenter = new LoginPresenter(this);
    }

    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.email_sign_in_button)
    public void onViewClicked() {
        loginPresenter.login(email.getText().toString(), password.getText().toString());
    }

    @Override
    public void loginWithPassword(LoginEntity loginEntity) {

        if (loginEntity.getErrorCode() == 0) {
            finish();
        }

    }
}
