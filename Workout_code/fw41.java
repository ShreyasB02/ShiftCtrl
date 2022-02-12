package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw41 extends AppCompatActivity {

    private ImageView i41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw41);

        i41=(ImageView)findViewById(R.id.i41);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/41sideplankleft.jpg?alt=media&token=23793975-77ec-42fb-893e-0f6dfc8e89e1";




        Glide.with(getApplicationContext()).load(url1).into(i41);


    };


    public  void openi41 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=U4s4mEQ5VqU"));
        startActivity(browserIntent);
    }


}