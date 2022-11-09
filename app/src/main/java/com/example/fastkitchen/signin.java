package com.example.fastkitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class signin extends AppCompatActivity {
    private MaterialButton loginBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        loginBTN = (MaterialButton) findViewById(R.id.loginbtn);
        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signin.this,Home.class);
                startActivity(intent);
            }
        });
    }
}