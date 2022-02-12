package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw8 extends AppCompatActivity {
    private ImageView i8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw8);
        i8=(ImageView)findViewById(R.id.i8);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/8cruches.jpg?alt=media&token=17dd7fc4-0b22-4afb-a288-44596f6bff73";




        Glide.with(getApplicationContext()).load(url1).into(i8);


    };


    public  void openi8 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Xyd_fa5zoEU"));
        startActivity(browserIntent);
    }
}
