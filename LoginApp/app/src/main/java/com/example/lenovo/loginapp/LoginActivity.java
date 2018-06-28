package com.example.lenovo.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity
{
    private TextView textLogin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        Intent i=getIntent();
        String userName=i.getStringExtra("username");
        textLogin=(TextView)findViewById(R.id.textView2);
        textLogin.setText("Hello");
    }
}
