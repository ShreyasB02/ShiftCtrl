package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw18 extends AppCompatActivity {
    private ImageView i18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw18);
        i18=(ImageView)findViewById(R.id.i18);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/18russiantwist.jpg?alt=media&token=34faa0a9-3c51-47ab-8c30-60997225d6a0";



        Glide.with(getApplicationContext()).load(url1).into(i18);


    };

    public  void openi18 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=NeAtimSCxsY"));
        startActivity(browserIntent);
    }
}