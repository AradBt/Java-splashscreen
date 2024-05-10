package com.example.orginaltamrin3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.splash_activity);
        SplashWithThread();
    }

    private void SplashWithThread(){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(6000);
                    Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(intent);


                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread.start();




    }






    private void SplashWithHandler(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);

            }
        },6000);

    }
}

