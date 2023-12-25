package com.example.worldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class login extends AppCompatActivity {

    Context context = this;
    Spinner spinner; // spinner id'sini layout dosyanıza göre ayarlayın
    String[] days;
    String [] months;
    String[] years ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);




        //Day
        spinner = findViewById(R.id.day_spinner); // findViewById'ı buraya taşıyın
        days = getResources().getStringArray(R.array.day); // getResources'ı buraya taşıyın
        ArrayAdapter<String> dayadapterapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, days);
        spinner.setAdapter(dayadapterapter);

        //Month
        spinner = findViewById(R.id.month_spinner);
        months = getResources().getStringArray(R.array.month);
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, months);
        spinner.setAdapter(monthAdapter);

        //Year
        spinner = findViewById(R.id.year_spinner);
        years = getResources().getStringArray(R.array.years);
        ArrayAdapter<String> yearAdapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, years);
        spinner.setAdapter(yearAdapter);
    }
}