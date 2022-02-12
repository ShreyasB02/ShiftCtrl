package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw4 extends AppCompatActivity {
    private ImageView i4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw4);
        i4=(ImageView)findViewById(R.id.i4);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/4inclinepushup.jpg?alt=media&token=f4867d84-8845-4ba5-a204-a85d6d6a9b65";




        Glide.with(getApplicationContext()).load(url1).into(i4);


    };


    public  void openi4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Me9bHFAxnCs"));
        startActivity(browserIntent);
    }
}

