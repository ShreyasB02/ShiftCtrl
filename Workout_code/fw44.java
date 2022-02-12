package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw44 extends AppCompatActivity {

    private ImageView i44;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw44);

        i44=(ImageView)findViewById(R.id.i44);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/44birddog.jpg?alt=media&token=74ea5721-7a87-49d1-a6a6-6e10f1f036fc";




        Glide.with(getApplicationContext()).load(url1).into(i44);


    };


    public  void openi44 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=zL0YEtJulBs"));
        startActivity(browserIntent);
    }


}