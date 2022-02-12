package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw6 extends AppCompatActivity {
    private ImageView i6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw6);


        i6=(ImageView)findViewById(R.id.i6);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/6wallsit.jpg?alt=media&token=aa5a2a7d-3bb9-4535-87ac-6ff540fd682c";




        Glide.with(getApplicationContext()).load(url1).into(i6);


    };


    public  void openi6 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XULOKw4E4P4"));
        startActivity(browserIntent);
    }
}


