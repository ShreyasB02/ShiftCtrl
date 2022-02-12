package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw33 extends AppCompatActivity {
    private ImageView i33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw33);
        i33=(ImageView)findViewById(R.id.i33);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/33kneepushup.jpg?alt=media&token=e93f127d-0985-4bd0-9016-7dd48dd43c99";



        Glide.with(getApplicationContext()).load(url1).into(i33);


    };

    public  void openi33 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hyv14e2QDq0"));
        startActivity(browserIntent);
    }
}
