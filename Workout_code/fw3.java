package com.example.stayfit;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import androidx.appcompat.app.AppCompatActivity;

public class fw3 extends AppCompatActivity {
    private ImageView i3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fw3);
        i3=(ImageView)findViewById(R.id.i3);



        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/3highstepping.jpg?alt=media&token=1c4711aa-117e-4c2e-b08e-017341875df4";




        Glide.with(getApplicationContext()).load(url1).into(i3);


    };


    public  void openi3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=kMFv3Alg-Gc"));
        startActivity(browserIntent);
    }

}
