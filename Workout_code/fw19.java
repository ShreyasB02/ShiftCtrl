package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw19 extends AppCompatActivity {

    private ImageView i19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw19);

        i19=(ImageView)findViewById(R.id.i19);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/20situp.png?alt=media&token=ce8394e6-4041-4ef2-a94b-41f31907be45";




        Glide.with(getApplicationContext()).load(url1).into(i19);


    };

    public  void openi19 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=17ydV85ihp8"));
        startActivity(browserIntent);
    }


}