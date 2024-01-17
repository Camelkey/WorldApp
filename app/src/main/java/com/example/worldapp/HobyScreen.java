package com.example.worldapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HobyScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoby_screen);

        //Pull  Data
        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("password");
        String email = getIntent().getStringExtra("email");

        // Take Hobbies


    }
}