package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw2 extends AppCompatActivity {

    private ImageView i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw2);

        i2=(ImageView)findViewById(R.id.i2);

        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/2bridge.jpg?alt=media&token=c4bfd35f-1385-4300-b837-f1ec2e34c240";


        Glide.with(getApplicationContext()).load(url1).into(i2);


    };


    public  void openi2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WowARnE-p0s"));
        startActivity(browserIntent);
    }


}

