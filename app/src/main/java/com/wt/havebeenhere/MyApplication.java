package com.wt.havebeenhere;

import android.app.Application;

import cn.bmob.v3.Bmob;
import cn.smssdk.SMSSDK;

/**
 * Created by Administrator on 2016/7/31 0031.
 */
public class MyApplication extends Application {

    //mob
    private static final String APP_KEY = "1595b9f6c8e10";
    private static final String APP_SECRET = "2cb3f224a064051da8b583adb9513542";

    //bmob
    private static final String APP_ID = "230d23e971087bc232876ac3831b5a26";

    @Override
    public void onCreate() {
        super.onCreate();

        /**
         * 初始化Mob短信验证码sdk
         */
        SMSSDK.initSDK(this, APP_KEY, APP_SECRET);
        /**
         * 初始化Bmob数据存储
         */
        Bmob.initialize(this, APP_ID);
    }
}
