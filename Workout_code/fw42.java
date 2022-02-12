package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw42 extends AppCompatActivity {

    private ImageView i42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw42);

        i42=(ImageView)findViewById(R.id.i42);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/42mountainclimbers.jpg?alt=media&token=f8d5b1b5-c68a-4e96-8492-b7fd6a746c4e";




        Glide.with(getApplicationContext()).load(url1).into(i42);


    };


    public  void openi42 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=H9_wC-Xv2P4"));
        startActivity(browserIntent);
    }


}
