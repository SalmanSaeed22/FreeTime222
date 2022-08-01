package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity implements View.OnClickListener  {
    private CardView card1 , card2 , card3 , card4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //defining cards
        card1 = (CardView) findViewById(R.id.card1) ;
        card2 = (CardView) findViewById(R.id.card2) ;
        card3 = (CardView) findViewById(R.id.card3) ;
        card4 = (CardView) findViewById(R.id.card4) ;
        //add click  listener to cards
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        Button setting= findViewById(R.id.setting);
        setting.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {



        Intent i;
        switch (v.getId()) {
            case R.id.card1:i = new Intent(this , cafe.class);startActivity(i);break;
            case R.id.card2:i = new Intent(this , restaurant.class);startActivity(i);break;
            case R.id.card3:i = new Intent(this , Blogs.class);startActivity(i);break;
            case R.id.card4:i = new Intent(this , Activities.class);startActivity(i);break;
            case R.id.setting:i=new Intent(this, SettingsActivity.class);startActivity(i);break;
        }
    }}