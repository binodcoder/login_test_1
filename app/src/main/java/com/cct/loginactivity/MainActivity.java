package com.cct.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mapping
        username=(EditText)findViewById(R.id.et_username);
        password=(EditText)findViewById(R.id.et_password);
        login=(Button)findViewById(R.id.btn_login);

        //Button Click Event
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                Intent intent=new Intent(MainActivity.this, Profile.class);


                //create bundle
                Bundle bundle=new Bundle();
                bundle.putString("user", user);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}