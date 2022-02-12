package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw36 extends AppCompatActivity {

    private ImageView i36;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw36);

        i36=(ImageView)findViewById(R.id.i36);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/36Decline-Pushup.jpg?alt=media&token=c2c36126-5b87-4bf2-b639-28873fac43a6";




        Glide.with(getApplicationContext()).load(url1).into(i36);


    };


    public  void openi36 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_M2Etme-tfE"));
        startActivity(browserIntent);
    }


}