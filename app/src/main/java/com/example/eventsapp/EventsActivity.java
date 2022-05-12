package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EventsActivity extends AppCompatActivity {

    public void goToParty1 (View view){
        Intent intent = new Intent (this, EventsMainPage.class);
        startActivity(intent);
    }

    public void goToParty2 (View view){
        Intent intent = new Intent (this, EventsMainPage2.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}