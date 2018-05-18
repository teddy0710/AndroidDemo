package com.arms.zfl.androidlearning.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 静态注册广播 1.编写类继承BroadcastReceiver，实现onReceive方法
 * Created by ZFL on 2018/5/18
 */

public class BatteryReceiver extends BroadcastReceiver {
    String TAG = "BatteryReceiver";
    String BATTERY_ACTION = "android.intent.action.BATTERY_LOW";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "action = " + intent.getAction());
    }
}
