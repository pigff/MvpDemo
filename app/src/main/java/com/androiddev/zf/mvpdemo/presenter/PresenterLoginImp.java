package com.androiddev.zf.mvpdemo.presenter;

import com.androiddev.zf.mvpdemo.model.IModelLogin;
import com.androiddev.zf.mvpdemo.model.ModelLoginImp;
import com.androiddev.zf.mvpdemo.view.IViewLogin;

/**
 * Created by greedy on 2017/5/4.
 */

public class PresenterLoginImp implements IPresenterLogin {

    private IViewLogin mIViewLogin;
    private final IModelLogin mModelLogin;

    public PresenterLoginImp(IViewLogin IViewLogin) {
        mIViewLogin = IViewLogin;
        mModelLogin = new ModelLoginImp();
    }

    @Override
    public void login(String userName, String psw) {
        String result = mModelLogin.getResult(userName, psw);
        mIViewLogin.result(result);
    }


}
