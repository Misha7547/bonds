package com.example.bonds;

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

    public void startCalculations(View v){
        Intent intent = new Intent(this,Calculations.class);
        startActivity(intent);
    }

    public void startInfo(View v){
        Intent intent = new Intent(this,Info.class);
        startActivity(intent);
    }

}