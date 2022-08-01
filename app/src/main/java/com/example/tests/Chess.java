package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Chess extends AppCompatActivity {
TextView chess ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chess);

        chess = findViewById(R.id.chess);
        chess.setMovementMethod(LinkMovementMethod.getInstance());

    }
}