package com.example.mental_health_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }

    public void info(View v){
        Bundle extras = new Bundle();

        Intent intent = new Intent(MainActivity1.this,MainActivity2.class);
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void comment(View v){
        Bundle extras = new Bundle();

        Intent intent = new Intent(MainActivity1.this,MainActivity2.class);
        intent.putExtras(extras);
        startActivity(intent);
    }
}