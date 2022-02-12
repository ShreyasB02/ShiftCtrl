package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw1 extends AppCompatActivity {

    private ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw1);

        i1=(ImageView)findViewById(R.id.i1);

        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/1spider.jpg?alt=media&token=a7efa235-822d-4fcb-9cb3-aa435c1472ee";


        Glide.with(getApplicationContext()).load(url1).into(i1);


    };


    public  void openi1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=fKBeHALPsSU"));
        startActivity(browserIntent);
    }


}

