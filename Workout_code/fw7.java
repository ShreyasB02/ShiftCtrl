package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw7 extends AppCompatActivity {
    private ImageView i7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw7);

        i7=(ImageView)findViewById(R.id.i7);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/7jumping%20jacks.png?alt=media&token=8000cf2b-b835-4fe2-86d3-9522e676f781";




        Glide.with(getApplicationContext()).load(url1).into(i7);


    };


    public  void openi7 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=UpH7rm0cYbM"));
        startActivity(browserIntent);
    }
}
