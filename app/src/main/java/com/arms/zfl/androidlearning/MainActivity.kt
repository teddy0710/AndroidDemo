package com.arms.zfl.androidlearning

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    lateinit var batteryReceiver: BatteryInfoReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        batteryReceiver = BatteryInfoReceiver()

    }

    override fun onResume() {
        super.onResume()
        registerBatteryInfo()
    }

    override fun onPause() {
        super.onPause()
        unregisterBatteryInfo()
    }

    private fun registerBatteryInfo() {
        val filter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
        registerReceiver(batteryReceiver, filter)
    }

    private fun unregisterBatteryInfo() {
        unregisterReceiver(batteryReceiver)
    }

    class BatteryInfoReceiver : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            val action = intent?.action
            if (action.equals(Intent.ACTION_BATTERY_CHANGED)) {
                Log.e("BatteryInfoReceiver", "battery changed action" + (intent?.action ?: ""))
            }
        }

    }
}
