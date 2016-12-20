package com.yair.travelagencies.EazyTour.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.yair.travelagencies.EazyTour.R;

public class RegistryActivity extends AppCompatActivity {

    TextView name, id , password;
    SharedPreferences sharedpreferences;
    public static final String mypreference = "mypref";
    public static final String Name = "nameKey";
    public static final String Id = "idKey";
    public static final String Password = "passwordKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);
        name = (TextView) findViewById(R.id.userNameInput);
        id = (TextView) findViewById(R.id.userIdInput);
        password=(TextView) findViewById(R.id.passwordInput);

        sharedpreferences = getSharedPreferences(mypreference, Context.MODE_PRIVATE);
    }

    public void registry(View view) {
        String n = name.getText().toString();
        String i = id.getText().toString();
        String p = password.getText().toString();
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(Name, n);
        editor.putString(Id, i);
        editor.putString(Password, p);
        editor.commit();


    }
}
