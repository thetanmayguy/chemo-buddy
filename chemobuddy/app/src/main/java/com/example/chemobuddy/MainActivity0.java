package com.example.chemobuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity0 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);
    }
    public void about(View view){
        Intent intent = new Intent(this,AboutActivity.class);
        startActivity(intent);
    }
    public void login(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}