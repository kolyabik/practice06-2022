package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button toSchedule;
    Button toInformation;
    Button toContacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toSchedule = (Button) findViewById(R.id.toShedule);
        toContacts = (Button) findViewById(R.id.toContacts);
        toInformation = (Button) findViewById(R.id.toInformation);

        toContacts.setOnClickListener(this);
        toInformation.setOnClickListener(this);
        toSchedule.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case R.id.toContacts:
                intent = new Intent(this, Contacts.class);
                break;
            case R.id.toInformation:
                intent = new Intent(this,Information.class);
                break;
            case R.id.toShedule:
                intent = new Intent(this,Schedule.class);
                break;
        }
    }
}
