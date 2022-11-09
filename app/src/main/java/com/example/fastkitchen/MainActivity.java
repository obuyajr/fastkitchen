package com.example.fastkitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //takes you to login page/ landing page
                Intent intent = new Intent(MainActivity.this,signin.class);
                startActivity(intent);
                finish();
            }
        },1500);
    }
}