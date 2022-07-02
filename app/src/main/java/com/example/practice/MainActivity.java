package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSchedule(View view) {
        Intent intent = new Intent(this,Schedule.class);
        startActivity(intent);
    }

    public void toContact(View view) {
        Intent intent = new Intent(this,Contacts.class);
        startActivity(intent);
    }

    public void toInformation(View view) {
        Intent intent = new Intent(this,Information.class);
        startActivity(intent);
    }
}
