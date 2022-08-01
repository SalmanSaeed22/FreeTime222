package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;

public class Alex extends AppCompatActivity {

    TextView Alex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alex);

        Alex = findViewById(R.id.aswan);
        Alex.setMovementMethod(LinkMovementMethod.getInstance());



    }
    }
