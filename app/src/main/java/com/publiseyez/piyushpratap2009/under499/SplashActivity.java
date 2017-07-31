package com.publiseyez.piyushpratap2009.under499;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {
    Handler handler;
    Thread thread;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        handler = new Handler();
    }

    @Override
    protected void onResume() {
        super.onResume();
        thread = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    handler.post(new Runnable() {
                        public void run() {
                            goToNextScreen();
                        }
                    });
                } catch (InterruptedException e) {
                }
            }
        };

        thread.start();
    }

    protected void goToNextScreen() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
        finish();
    }
}
