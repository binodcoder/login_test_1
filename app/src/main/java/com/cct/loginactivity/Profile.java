package com.cct.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        name=(TextView)findViewById(R.id.tv_display_name);

        //Get the bundle
        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String username = bundle.getString("user");


        name.setText(username);
    }
}