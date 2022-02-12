package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw37 extends AppCompatActivity {

    private ImageView i37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw37);

        i37=(ImageView)findViewById(R.id.i37);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/37splitsquatleft.jpg?alt=media&token=f87c15f5-c550-4b1e-b256-8ece03ccfbed";




        Glide.with(getApplicationContext()).load(url1).into(i37);


    };


    public  void openi37 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WBmXffkfcXQ"));
        startActivity(browserIntent);
    }


}