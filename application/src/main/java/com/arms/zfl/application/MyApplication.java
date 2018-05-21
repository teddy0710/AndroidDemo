package com.arms.zfl.application;

import android.app.Application;
import android.util.Log;


/**
 * Created by ZFL on 2018/5/21
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("MyApplication: ", this.toString());
    }
}
