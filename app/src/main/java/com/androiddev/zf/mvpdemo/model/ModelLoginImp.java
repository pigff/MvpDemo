package com.androiddev.zf.mvpdemo.model;

import android.text.TextUtils;

/**
 * Created by greedy on 2017/5/4.
 */

public class ModelLoginImp implements IModelLogin {

    @Override
    public String getResult(String userName, String psw) {
        if (TextUtils.equals(userName, "linjianlin") && TextUtils.equals(psw, "123456")) {
            return userName + "登录成功";
        } else {
            return "用户名或者密码错误";
        }
    }
}
