package com.bawp.to_do_list_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {



    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                doStuff();
            }
        },5000);
    }
    private void doStuff(){
        Intent intent = new Intent(MainActivity.this,Screen.class);
        startActivity(intent);
    }
}