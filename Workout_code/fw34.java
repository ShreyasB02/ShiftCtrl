package com.example.stayfit;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw34 extends AppCompatActivity {
    private ImageView i34;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw34);
        i34=(ImageView)findViewById(R.id.i34);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/34tricepdip.png?alt=media&token=3d54a143-b140-417f-ae03-864941ca9fcd";



        Glide.with(getApplicationContext()).load(url1).into(i34);


    };

    public  void openi34 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=EgIMk-PZwo0"));
        startActivity(browserIntent);
    }
}