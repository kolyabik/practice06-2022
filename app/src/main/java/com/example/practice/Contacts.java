package com.example.practice;

import
androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Contacts extends AppCompatActivity implements View.OnClickListener {

    private TextView toMap;
    private TextView toTel;
    private TextView toWeb;
    private Button toStart;
    private TextView copyEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        toMap = findViewById(R.id.map);
        toTel = findViewById(R.id.tel);
        toWeb = findViewById(R.id.web);
        toStart = (Button) findViewById(R.id.start);
        copyEmail = findViewById(R.id.email);

        toMap.setOnClickListener( this);
        toTel.setOnClickListener( this);
        toWeb.setOnClickListener( this);
        toStart.setOnClickListener(this);
        copyEmail.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent intent;
        ClipboardManager clipboard = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);

        switch(view.getId()){
            case R.id.map:
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:56.317887, 43.987975"));
                startActivity(intent);
                break;
            case R.id.web:
                intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://nizh.cso52.ru/index.php/nizh-about-center"));
                startActivity(intent);
                break;
            case R.id.tel:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:88314300761"));
                startActivity(intent);
                break;
            case R.id.start:
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.email:
                ClipData clip = ClipData.newPlainText("", copyEmail.getText().toString().substring(6));
                clipboard.setPrimaryClip(clip);
                Toast.makeText(this,"Текст скопирован",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
