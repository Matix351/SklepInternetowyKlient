package com.example.sklepinternetowyklient;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            Intent nextActivity = new Intent(MainActivity.this, ShopViewActivity.class);



            @Override
            public void run() {

                MainActivity.this.startActivity(nextActivity);

            }
        };
        timer.schedule(task, 1500);







    }
}