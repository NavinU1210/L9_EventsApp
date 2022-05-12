package com.example.eventsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EventCards1 extends AppCompatActivity {

    public void goToJoinedEvent (View view){
        Intent intent = new Intent (this, Event_Joined1.class);
        startActivity(intent);
    }

    public void goToCard2(View view){
        Intent intent = new Intent (this, EventCards2.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_cards1);
    }
}