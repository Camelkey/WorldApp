package com.example.worldapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button loginButton;
    private EditText emailEditText,passwordEditText ;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.emailText);
        passwordEditText = findViewById(R.id.passwordText);
        loginButton  = findViewById(R.id.loginBtn);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Giriş işlemini yap
                if (doLogin(email, password)) {

                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {

                    Toast.makeText(LoginActivity.this, "Giriş başarısız. Lütfen bilgilerinizi kontrol edin.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private boolean doLogin(String email, String password) {
        DataBaseHelper dbHelper = new DataBaseHelper(LoginActivity.this);
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String[] projection = {
                DataBaseHelper.COLUMN_EMAIL,
                DataBaseHelper.COLUMN_PASSWORD
        };
        String selection = DataBaseHelper.COLUMN_EMAIL + " = ? AND " + DataBaseHelper.COLUMN_PASSWORD + " = ?";
        String[] selectionArgs = {email, password};

        Cursor cursor = db.query(
                DataBaseHelper.TABLE_USER,
                projection,
                selection,
                selectionArgs,
                null,
                null,
                null
        );


        if (cursor != null && cursor.getCount() > 0) {
            cursor.close();
            db.close();
            return true;
        } else {

            if (cursor != null) {
                cursor.close();
            }
            db.close();
            return false;
        }
    }


    }

