package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class fw11 extends AppCompatActivity {
    private ImageView i11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw11);

        i11=(ImageView)findViewById(R.id.i11);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/11onelegpushup.jpg?alt=media&token=5429b698-a79a-415e-b679-fe726da977a2";



        Glide.with(getApplicationContext()).load(url1).into(i11);


    };

    public  void openi11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Vzlfas-sBVU"));
        startActivity(browserIntent);
    }

}