package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;

public class fw22 extends AppCompatActivity {
    private ImageView i22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw22);

        i22=(ImageView)findViewById(R.id.i22);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/22bicyclecrunches.jpg?alt=media&token=615cbaed-70c8-4ff1-8985-02dc959f202d";



        Glide.with(getApplicationContext()).load(url1).into(i22);


    };

    public  void openi22 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NECcLiefy0M"));
        startActivity(browserIntent);
    }
}