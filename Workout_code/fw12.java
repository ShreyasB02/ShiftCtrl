package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw12 extends AppCompatActivity {
    private ImageView i12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw12);
        i12=(ImageView)findViewById(R.id.i12);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/12widearm.jpg?alt=media&token=4f4fe7d5-9b50-4177-a896-decc8ebe6b78";



        Glide.with(getApplicationContext()).load(url1).into(i12);


    };

    public  void openi12 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=B78GwfC-87Y"));
        startActivity(browserIntent);
    }
}