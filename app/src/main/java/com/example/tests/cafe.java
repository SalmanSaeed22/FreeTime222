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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class cafe<searchView> extends AppCompatActivity {



    RatingBar ratingBar;
Button buttonrate;

    ListView list;
    String titles []={"El-Fishawy ","El Qahwa khan" ,"Kunst" , "corner" ,"costa" , "om kolthoom" };


    String descriptions [] ={
            "جسر السويس، الهايكستب، قسم النزهة، محافظة القاهرة" ,
            "25 عرابي -معادي السرايات الغربية حي المعادي",
            " 28 شارع شريف باشا، الفوالة، عابدين" ,"" +
            "21 233، معادي السرايات الغربية مفتوح 24 ساعه" ,
            "اطلع علي اللينك :https://www.3nwaan.com/2020/03/costa-coffee-branches-egypt.html",
            " 2 سرايا الازبكيه، عرابي، حي الأزبكية"};

    int imgs [] ={R.drawable.elfeshawy ,R.drawable.khana , R.drawable.kkunst , R.drawable.corner , R.drawable.costa , R.drawable.om};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);




        list=findViewById(R.id.list3);

        //create custom adapter class


        MyAdapter adapter2 =new MyAdapter(this,titles,imgs,descriptions);


        //set adpter to list
        list.setAdapter(adapter2);





        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(cafe.this, "Clicked item one", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(cafe.this, cafe.class);
                    startActivity(c);

                }
                if (position == 1) {
                    Toast.makeText(cafe.this, "Clicked item Two", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(cafe.this, cafe.class);
                    startActivity(c);

                }
                if (position == 2) {
                    Toast.makeText(cafe.this, "Clicked item Three", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(cafe.this, cafe.class);
                    startActivity(c);

                }
                if (position ==3) {
                    Toast.makeText(cafe.this, "Clicked item Four", Toast.LENGTH_LONG).show();

                    Intent c = new Intent(cafe.this, cafe.class);
                    startActivity(c);

                }
                if (position == 4) {
                    Toast.makeText(cafe.this, "Clicked item Five", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(cafe.this, cafe.class);
                    startActivity(c);

                }
                if (position == 5) {
                    Toast.makeText(cafe.this, "Clicked item six", Toast.LENGTH_LONG).show();
                    Intent c = new Intent(cafe.this, cafe.class);
                    startActivity(c);}
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
            /*ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                }
            });



*/

            
            
            
            
            return row;
        }
    }



}