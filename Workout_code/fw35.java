package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw35 extends AppCompatActivity {

    private ImageView i35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw35);

        i35=(ImageView)findViewById(R.id.i35);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/35abdominalcrunches.jpg?alt=media&token=174241b4-4389-4d61-a55b-991daec2759f";




        Glide.with(getApplicationContext()).load(url1).into(i35);


    };


    public  void openi35 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0326dy_-CzM"));
        startActivity(browserIntent);
    }


}
