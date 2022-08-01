package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Activities extends AppCompatActivity {

    ListView activitylist ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);


        activitylist = (ListView) (findViewById(R.id.activitylist));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("شطرنج");
        arrayList.add("طاولة31 ");
        arrayList.add("اونو");
        arrayList.add("طاولة أمريكي");
        arrayList.add("دومنو");
        arrayList.add("جينغا");
        arrayList.add("مونوبو ديل");
        arrayList.add("بنك الحظ");
        arrayList.add(" Tabletop Game");
        arrayList.add("Connect Four");
        arrayList.add("Hide and Seek");
        arrayList.add("Guess the Sound");

       // ArrayAdapter arrayAdapter = new ArrayAdapter<>(this , androidx.appcompat.R.layout.textcoloroflist , arrayList);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,R.layout.textcoloroflist, arrayList);
        activitylist.setAdapter(arrayAdapter);

        activitylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Activities.this, "Clicked item one", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(Activities.this, Chess.class);
                    startActivity(c);

                } if (position == 1) {
                    Toast.makeText(Activities.this, "Clicked item Two", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(Activities.this, Tawla.class);
                    startActivity(c);

                }
    }
});}}