package com.arms.zfl.broadcastsend;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String broadcastIntent = "com.example.android.normal";//自己自定义
                Intent intent = new Intent(broadcastIntent);
                MainActivity.this.sendBroadcast(intent);
                Toast.makeText(MainActivity.this, "send", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
