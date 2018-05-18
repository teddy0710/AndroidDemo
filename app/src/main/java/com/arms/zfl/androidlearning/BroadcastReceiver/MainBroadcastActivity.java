package com.arms.zfl.androidlearning.BroadcastReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.arms.zfl.androidlearning.R;

/**
 * 广播动态注册
 */
public class MainBroadcastActivity extends AppCompatActivity {
    String TAG = "MainBroadcastActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_broadcast);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(mBatteryChangedReceived, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(mBatteryChangedReceived);
    }

    private BroadcastReceiver mBatteryChangedReceived = new BatteryReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.d(TAG, "action :" + intent.getAction());
        }
    };
}
