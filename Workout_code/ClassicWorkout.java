package com.example.stayfit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ClassicWorkout extends AppCompatActivity {

    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classic_workout);

        img1=(ImageView)findViewById(R.id.img1);
        img2=(ImageView)findViewById(R.id.img2);
        img3=(ImageView)findViewById(R.id.img3);
        img4=(ImageView)findViewById(R.id.img4);
        img5=(ImageView)findViewById(R.id.img5);
        img6=(ImageView)findViewById(R.id.img6);
        img7=(ImageView)findViewById(R.id.img7);
        img8=(ImageView)findViewById(R.id.img8);
        img9=(ImageView)findViewById(R.id.img9);
        img10=(ImageView)findViewById(R.id.img10);
        img11=(ImageView)findViewById(R.id.img11);
        img12=(ImageView)findViewById(R.id.img12);

        String url1="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img1.png?alt=media&token=e6f9abc8-d4ac-41c9-b74c-d06882788e29";
        String url2="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img3.png?alt=media&token=d0dbc48c-e0eb-44c9-ac2c-d7e2f4dfe4c8";
        String url3="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img4.png?alt=media&token=ea86d829-3e1c-4e9f-a472-d9b14736c771";
        String url4="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img5.png?alt=media&token=c6da8ed6-b3a8-408a-92f6-e3f33987219d";
        String url5="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img6.png?alt=media&token=67b48765-9dc2-403b-a186-d0e73d1ce3e6";
        String url6="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img9.png?alt=media&token=7d12a74a-1791-483a-950e-7caac81687c9";
        String url7="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img7.png?alt=media&token=b9b682d6-4ca0-46ad-b1b8-deb91cabf5a5";
        String url8="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img8.png?alt=media&token=ba12196d-03e4-46a5-bbeb-97ea2a8abf72";
        String url9="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img10.png?alt=media&token=4c1ded0d-384a-41db-b9c7-afc2aabe3dac";
        String url10="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img11.png?alt=media&token=8fadddd2-59d1-4808-8292-b9371e1630ca";
        String url11="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img12.png?alt=media&token=0e76d822-0595-4881-9cd0-15f879aa4c93";
        String url12="https://firebasestorage.googleapis.com/v0/b/stayfit-83b02.appspot.com/o/img13.png?alt=media&token=42435e77-af3b-45c5-a859-75d6ac254ab3";

        Glide.with(getApplicationContext()).load(url1).into(img1);
        Glide.with(getApplicationContext()).load(url2).into(img2);
        Glide.with(getApplicationContext()).load(url3).into(img3);
        Glide.with(getApplicationContext()).load(url4).into(img4);
        Glide.with(getApplicationContext()).load(url5).into(img5);
        Glide.with(getApplicationContext()).load(url6).into(img6);
        Glide.with(getApplicationContext()).load(url7).into(img7);
        Glide.with(getApplicationContext()).load(url8).into(img8);
        Glide.with(getApplicationContext()).load(url9).into(img9);
        Glide.with(getApplicationContext()).load(url10).into(img10);
        Glide.with(getApplicationContext()).load(url11).into(img11);
        Glide.with(getApplicationContext()).load(url12).into(img12);
    };

    public  void open1 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/yDSMdd8hiFg"));
        startActivity(browserIntent);
    }

    public  void open2 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Eh00_rniF8E"));
        startActivity(browserIntent);
    }
    public  void open3 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/M6yAoJJQvGY"));
        startActivity(browserIntent);
    }

    public  void open4 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/ay-MtjfYtwo"));
        startActivity(browserIntent);
    }
    public  void open5 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/SU2UmCkiKC8"));
        startActivity(browserIntent);
    }
    public  void open6 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kMFv3Alg-Gc"));
        startActivity(browserIntent);
    }
    public  void open7 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6kALZikXxLc"));
        startActivity(browserIntent);
    }
    public  void open8 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/pSHjTRCQxIw"));
        startActivity(browserIntent);
    }
    public  void open9 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Z2n58m2i4jg"));
        startActivity(browserIntent);
    }
    public  void open10 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/iu3VptPuikY"));
        startActivity(browserIntent);
    }

    public  void open11 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NXr4Fw8q60o"));
        startActivity(browserIntent);
    }

    public  void open12 (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/NXr4Fw8q60o"));
        startActivity(browserIntent);
    }
}

