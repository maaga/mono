package com.example.Hows;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class HimaTouroku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hima_activity);

        Button returnButton = findViewById(R.id.return_button);
        // lambda式
        returnButton.setOnClickListener(v -> finish());
    }
}