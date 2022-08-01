package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Tawla extends AppCompatActivity {
    TextView tawla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tawla);

        tawla = findViewById(R.id.aswan);
        tawla.setMovementMethod(LinkMovementMethod.getInstance());
    }
}