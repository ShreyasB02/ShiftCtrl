package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw30 extends AppCompatActivity {
    private ImageView i30;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw30);
        i30=(ImageView)findViewById(R.id.i30);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/30plank.jpg?alt=media&token=9721d373-8a7d-4c79-a143-c18edf795af2";



        Glide.with(getApplicationContext()).load(url1).into(i30);


    };

    public  void openi30 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Iwyvozckjak"));
        startActivity(browserIntent);
    }
}