package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    public void goToSignUp (View view){
        Intent intent = new Intent (this, SignUpActivity.class);
        startActivity(intent);
    }

    public void goToMainPage (View view){
        Intent intent = new Intent (this, EventsActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}