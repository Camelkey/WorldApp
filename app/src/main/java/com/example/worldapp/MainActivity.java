package com.example.worldapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText emailEditText, passwordEditText, userNameEditText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameEditText = findViewById(R.id.userNameText);
        emailEditText = findViewById(R.id.emailText);
        passwordEditText = findViewById(R.id.passwordText);
        Button contine = findViewById(R.id.contine);
        Button login = findViewById(R.id.login);

        contine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userNameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                //Username check
                if (TextUtils.isEmpty(username)) {
                    userNameEditText.setError("Kullanıcı adı boş bırakılamaz.");
                    return;
                }

                // Email format control
                if (!isValidEmail(email)) {
                    emailEditText.setError("Geçerli bir e-posta adresi giriniz.");
                    return;
                }

                // Password length control
                if (password.length() < 6) {
                    passwordEditText.setError("Şifre en az 6 karakter olmalıdır.");
                    return;
                }

                // to the next screen
                Intent intent = new Intent(MainActivity.this, HobyScreen.class);
                intent.putExtra("username", username);
                intent.putExtra("password", password);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);

            }
        });
    }

    //
    private boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}








































