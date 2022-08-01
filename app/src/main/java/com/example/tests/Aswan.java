package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aswan extends AppCompatActivity {

    TextView Aswan ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aswan);

        Aswan = findViewById(R.id.aswan);
        Aswan.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
