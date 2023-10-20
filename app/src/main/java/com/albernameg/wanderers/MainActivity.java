package com.albernameg.wanderers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button explore_btn;
    Intent loginIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explore_btn = findViewById(R.id.explore_btn);
        loginIntent = new Intent(this, LoginActivity.class);

        explore_btn.setOnClickListener(v -> {
            startActivity(loginIntent);
        });

    }
}