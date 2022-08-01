package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Blogs extends AppCompatActivity {
    ListView blogslist ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogs);
        blogslist = (ListView) (findViewById(R.id.bloglist));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("أفضل الاماكن للذهاب في أسوان");
        arrayList.add("أفضل الاماكن للذهاب في شرم الشيخ ");
        arrayList.add("افضل الاماكن للذهاب في أسكندرية");
        arrayList.add("كيف تحجز تذكرة طيران بسعر رائع");
        arrayList.add("تجربتي في ماليزيا");
        arrayList.add("مناطق يجب زيارتها في المغرب");




        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, R.layout.textcoloroflist, arrayList);
        blogslist.setAdapter(arrayAdapter);
        blogslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Blogs.this, "Clicked item one", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(Blogs.this, Aswan.class);
                    startActivity(c);

                }
                    if (position == 1) {
                        Toast.makeText(Blogs.this, "Clicked item two", Toast.LENGTH_LONG).show();
                        Intent c = new Intent(Blogs.this, Sharm.class);
                        startActivity(c);



                    }if (position == 2) {
                    Toast.makeText(Blogs.this, "Clicked item three", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(Blogs.this, Alex.class);
                    startActivity(c);

                }


        }

        });

    }
}