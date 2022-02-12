package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw17 extends AppCompatActivity {
    private ImageView i17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw17);
        i17=(ImageView)findViewById(R.id.i17);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/17squat.png?alt=media&token=bbefe4b6-8b52-416b-b568-3a650da23169";



        Glide.with(getApplicationContext()).load(url1).into(i17);


    };

    public  void openi17 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aclHkVaku9U"));
        startActivity(browserIntent);
    }
}