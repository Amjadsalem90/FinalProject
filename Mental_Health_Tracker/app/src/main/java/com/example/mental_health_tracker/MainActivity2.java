package com.example.mental_health_tracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void comments(View v){
        Bundle extras = new Bundle();

        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        intent.putExtras(extras);
        startActivity(intent);
    }
}