package com.yair.travelagencies.EazyTour.controller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yair.travelagencies.EazyTour.R;

public class LoginActivity extends AppCompatActivity {
    TextView name, password;
    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Password = "passwordKey";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = (TextView) findViewById(R.id.userNameInput);
        password = (TextView) findViewById(R.id.passwordInput);

        sharedpreferences = getSharedPreferences(mypreference,
                Context.MODE_PRIVATE);

        if (sharedpreferences.contains(Name)) {
            name.setText(sharedpreferences.getString(Name, ""));
            //name.setBackgroundColor(Color.YELLOW);
        }
        if (sharedpreferences.contains(Password)) {
            password.setText(sharedpreferences.getString(Password, ""));
        }
    }


    public void toRegistry(View view) {
        Intent toRegistry = new Intent(getApplicationContext(), RegistryActivity.class);
        startActivity((toRegistry));
    }

    public void login(View view) {

    }
}
