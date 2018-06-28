package com.example.lenovo.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button login;
    private Button reset;
    private TextView register;
    private TextView username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username=(TextView)findViewById(R.id.username);
        password=(TextView)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        reset=(Button)findViewById(R.id.reset);
        register=(TextView)findViewById(R.id.register);

        login.setOnClickListener(this);
        reset.setOnClickListener(this);
        register.setOnClickListener(this);

    }

    public void onClick(View v){

        //set your user name and name
        String Username1 = "abc";
        String Password1 = "abc";

        switch (v.getId())
        {
            case R.id.register :
                Username1=username.getText().toString();
                Password1=password.getText().toString();
                Toast.makeText(this,"Fill this Registration Page",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(i);
                break;

            case R.id.login :
                String Username=username.getText().toString();
                String Password=password.getText().toString();
                if(Username.equals("Dayanidhi")&&Password.equals("8585") || Username.equals(Username1)&&Password.equals(Password1))
                {
                    Intent i1=new Intent(MainActivity.this,LoginActivity.class);
                    i1.putExtra("username",Username);
                    startActivity(i1);
                }else{
                    Toast.makeText(this,"Incorrect Username or Password",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.reset :
                username.setText("");
                password.setText("");
                break;

        }
    }

}
