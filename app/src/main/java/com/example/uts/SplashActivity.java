package com.example.uts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

//10116020
// muhammad zulfikar hassan
//AKB1/IF 1
//21-05-2019

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                    finish();
                }
            }

        };
        thread.start();
    }
}


