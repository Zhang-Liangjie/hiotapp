package com.huatec.hiot_cloud.test.mvptest;

import android.widget.Toast;

import com.huatec.hiot_cloud.base.BasePresenter;
import com.huatec.hiot_cloud.test.mvptest.model.User;

public class TestPresenter  extends BasePresenter <TestView> {


    public TestPresenter(){

    }

    public  void login(User user){
        if ("zhangliangjie".equals(user.getUserName()) && "123456".equals(user.getPassword())){
            getView().showMessage("登录成功");
        }else{
            getView().showMessage("登录失败");
        }
    }

}
