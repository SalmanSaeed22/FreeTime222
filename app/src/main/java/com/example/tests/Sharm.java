package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Sharm extends AppCompatActivity {
    TextView sharm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharm);
        sharm = findViewById(R.id.aswan);
        sharm.setMovementMethod(LinkMovementMethod.getInstance());
    }
}