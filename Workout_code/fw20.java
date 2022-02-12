package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw20 extends AppCompatActivity {
    private ImageView i20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw20);

        i20=(ImageView)findViewById(R.id.i20);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/20situp.png?alt=media&token=ce8394e6-4041-4ef2-a94b-41f31907be45";



        Glide.with(getApplicationContext()).load(url1).into(i20);


    };

    public  void openi20 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=jDwoBqPH0jk"));
        startActivity(browserIntent);
    }
}