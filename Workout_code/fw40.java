package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw40 extends AppCompatActivity {

    private ImageView i40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw40);

        i40=(ImageView)findViewById(R.id.i40);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/40jumpsquat.jpg?alt=media&token=01352750-7a54-4e47-b8e1-4ef7cc96e17d";



        Glide.with(getApplicationContext()).load(url1).into(i40);


    };


    public  void openi40 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NmyiMb2XYAM"));
        startActivity(browserIntent);
    }


}