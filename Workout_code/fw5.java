package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw5 extends AppCompatActivity {
    private ImageView i5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw5);

        i5=(ImageView)findViewById(R.id.i5);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/5leftlunge.jpg?alt=media&token=1f10de03-397c-4b6d-8c55-84371c36dbf7";



        Glide.with(getApplicationContext()).load(url1).into(i5);


    };


    public  void openi5 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=QF0BQS2W80k"));
        startActivity(browserIntent);
    }
}

