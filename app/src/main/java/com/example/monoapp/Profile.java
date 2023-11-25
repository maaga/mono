package com.example.monoapp;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.profile_actibity);

        Button returnButton = findViewById(R.id.return_button);
        // lambda式
        returnButton.setOnClickListener(v -> finish());
    }
}
