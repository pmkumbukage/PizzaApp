package com.example.pizzaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    EditText UserName;
    EditText Password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        UserName=(EditText) findViewById(R.id.UserName);
        Password=(EditText) findViewById(R.id.Password); 
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(LogInActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
