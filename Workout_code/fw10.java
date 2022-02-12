package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw10 extends AppCompatActivity {
    private ImageView i10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw10);
        i10=(ImageView)findViewById(R.id.i10);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/10burpee.jpg?alt=media&token=0244d47b-6dbc-4639-adc1-6135713f074c";


        Glide.with(getApplicationContext()).load(url1).into(i10);


    };


    public  void openi11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JZQA08SlJnM"));
        startActivity(browserIntent);
    }
}
