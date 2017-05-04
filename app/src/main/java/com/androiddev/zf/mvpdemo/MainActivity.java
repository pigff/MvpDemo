package com.androiddev.zf.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.androiddev.zf.mvpdemo.presenter.IPresenterLogin;
import com.androiddev.zf.mvpdemo.presenter.PresenterLoginImp;
import com.androiddev.zf.mvpdemo.view.IViewLogin;

public class MainActivity extends AppCompatActivity implements IViewLogin, View.OnClickListener {

    /**
     * 请输入用户名
     */
    private EditText mEditUsername;
    /**
     * 请输入登录密码
     */
    private EditText mEditPassword;
    /**
     * 登录
     */
    private Button mBtnLogin;
    private IPresenterLogin mPresenterLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        mPresenterLogin = new PresenterLoginImp(this);
    }

    @Override
    public void result(String msg) {
        Log.d("MainActivity", msg);
    }

    private void initView() {
        mEditUsername = (EditText) findViewById(R.id.edit_username);
        mEditPassword = (EditText) findViewById(R.id.edit_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);
        mBtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                String userName = String.valueOf(mEditUsername.getText());
                String password = String.valueOf(mEditPassword.getText());
                mPresenterLogin.login(userName, password);
                break;
        }
    }
}
