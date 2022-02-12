package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;

public class fw31 extends AppCompatActivity {
    private ImageView i31;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw31);
        i31=(ImageView)findViewById(R.id.i31);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/31reversecrunches.jpg?alt=media&token=2d09b5e4-254c-44ea-a37c-1db0473f329a";



        Glide.with(getApplicationContext()).load(url1).into(i31);


    };

    public  void openi31 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=ASdvN_XEl_c"));
        startActivity(browserIntent);
    }
}