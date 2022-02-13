package com.example.yo7a.healthwatcher;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashoard);
        //TextView tv1=findViewById(R.id.username);
        //tv1.setText(t);

        Button b2=findViewById(R.id.measure);
        Button b3=findViewById(R.id.bmi);
        Button b4=findViewById(R.id.ex);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Dashboard.this,Primary.class);
                startActivity(i);
                finish();
            }

        });
       b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Dashboard.this,BMI.class);
                startActivity(i);
                finish();
            }
        });
       b4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(Dashboard.this,exercise.class);
               startActivity(i);
               finish();

          }
       });
  }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Really Exit?")
                .setMessage("Are you sure you want to exit?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, (arg0, arg1) -> {

                    Dashboard.super.onBackPressed();
                    finish();
                    System.exit(0);
                }).create().show();
    }

}