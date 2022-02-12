package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class fw9 extends AppCompatActivity {
    private ImageView i9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw9);
        i9=(ImageView)findViewById(R.id.i9);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/9pushuprotate.jpg?alt=media&token=c4a3f05c-e5a7-4910-9550-a85d4d0d9843";




        Glide.with(getApplicationContext()).load(url1).into(i9);


    };


    public  void openi9 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=awxqXW6i55A"));
        startActivity(browserIntent);
    }
}
