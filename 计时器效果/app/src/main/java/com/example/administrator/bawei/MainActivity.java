package com.example.administrator.bawei;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.iwgang.countdownview.CountdownView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CountdownView countdownView = (CountdownView) findViewById(R.id.bw_countdownview);
        //倒计时30分钟
        long time = (long) 15 * 60 * 1000;
        countdownView.start(time);
    }
}
