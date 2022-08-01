package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class restaurant extends AppCompatActivity {




    RatingBar ratingBar;
Button buttonrate;


    ListView listres;
    String titles []={"El-Dahan  ","El-madena" ,"ِKoshary Abu-Tarek" , "Hamza" ,"Sobhy Kaber"  };
    String descriptions [] ={
            " 1 شارع عبد المنعم رياض، خلف المركز الاوليمبى لتدريب الفرق القومية عرب المعادي"
            ,
            "42 شارع خيرت،، ميدان لاظوغلى"
            , " 16 ش معروف تقاطع ش شامبليون, قريب من دار القضاء العالى" ,"" +
            " 6 شارع النصر ميدان الجزائر المعادي الجديدة"
            ,"21 شارع عبيد, ابراج الصفوه امام الشركه الكهرباء،, 151 عبيد، قسم الساحل" };

    int imgs [] ={R.drawable.dahan ,R.drawable.madenna , R.drawable.abotaree , R.drawable.hamza , R.drawable.sobhy };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);




        listres=findViewById(R.id.listres);

        //create custom adapter class


        MyAdapter adapter2 =new MyAdapter(this,titles,imgs,descriptions);

        //set adpter to list
        listres.setAdapter(adapter2);


        listres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(restaurant.this, "Clicked item one", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(restaurant.this, restaurant.class);
                    startActivity(c);

                }
                if (position == 1) {
                    Toast.makeText(restaurant.this, "Clicked item Two", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(restaurant.this, restaurant.class);
                    startActivity(c);

                }
                if (position == 2) {
                    Toast.makeText(restaurant.this, "Clicked item Three", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(restaurant.this, restaurant.class);
                    startActivity(c);

                }
                if (position ==3) {
                    Toast.makeText(restaurant.this, "Clicked item Four", Toast.LENGTH_LONG).show();

                    Intent c = new Intent(restaurant.this, restaurant.class);
                    startActivity(c);

                }
                if (position == 4) {
                    Toast.makeText(restaurant.this, "Clicked item Five", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(restaurant.this, restaurant.class);
                    startActivity(c);

                }

            }});}
    class MyAdapter extends ArrayAdapter<String>{

        Context context;
        String myTitles[];
        String myDescriptions [];
        int[] imgs;



        MyAdapter(Context c, String [] titles, int[] imgs, String [] descriptions ){
            super(c,R.layout.row , R.id.text1,titles);
            this.context=c;
            this.imgs=imgs;
            this.myTitles=titles;
            this.myDescriptions=descriptions;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater =(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row =layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images=row.findViewById(R.id.logo);
            TextView myTitle=row.findViewById(R.id.text1);
            TextView myDescription=row.findViewById(R.id.text2);
            images.setImageResource(imgs[position]);
            myTitle.setText(titles[position]);
            myDescription.setText(descriptions[position]);



            ratingBar= row.findViewById(R.id.ratingBar);
            buttonrate = row.findViewById(R.id.ratebutton);

            buttonrate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String s = String.valueOf(ratingBar.getRating());
                    Toast.makeText(getApplicationContext(), s+"Star",Toast.LENGTH_SHORT).show();

                }
            });


            return row;
        }
    }


}