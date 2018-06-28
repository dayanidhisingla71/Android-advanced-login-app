package com.example.lenovo.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity
{
    TextView regText;
    EditText user,pass,pass1;
    Button submit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        regText=(TextView)findViewById(R.id.textView3);
        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        pass1=(EditText)findViewById(R.id.pass1);
        submit=(Button) findViewById(R.id.register);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
