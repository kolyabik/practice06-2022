package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Information extends AppCompatActivity implements View.OnClickListener {

    private TextView inn;
    private TextView ogrn;
    private TextView okpo;
    private TextView start;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        inn = findViewById(R.id.inn);
        okpo = findViewById(R.id.okpo);
        ogrn = findViewById(R.id.ogrn);
        start = findViewById(R.id.start);

        inn.setOnClickListener(this);
        ogrn.setOnClickListener(this);
        okpo.setOnClickListener(this);
        start.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ClipboardManager clipboard = (ClipboardManager) getSystemService(getApplicationContext().CLIPBOARD_SERVICE);
        ClipData clip;
        switch (view.getId()){
            case R.id.inn:
                clip = ClipData.newPlainText("", inn.getText().toString().substring(7));
                clipboard.setPrimaryClip(clip);
                Toast.makeText(this,"Текст скопирован",Toast.LENGTH_LONG).show();
                break;
            case R.id.ogrn:
                clip = ClipData.newPlainText("", ogrn.getText().toString().substring(8));
                clipboard.setPrimaryClip(clip);
                Toast.makeText(this,"Текст скопирован",Toast.LENGTH_LONG).show();
                break;
            case R.id.okpo:
                clip = ClipData.newPlainText("", okpo.getText().toString().substring(8));
                clipboard.setPrimaryClip(clip);
                Toast.makeText(this,"Текст скопирован",Toast.LENGTH_LONG).show();
                break;
            case R.id.start:
                Intent intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
