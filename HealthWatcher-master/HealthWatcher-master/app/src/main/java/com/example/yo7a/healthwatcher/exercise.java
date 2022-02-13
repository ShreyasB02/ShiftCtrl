package com.example.yo7a.healthwatcher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class exercise extends AppCompatActivity {
Object k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        TextView t=findViewById(R.id.tv1);
        TextView t6=findViewById(R.id.tv2);
        EditText t3=findViewById(R.id.e1);
        EditText t4=findViewById(R.id.e2);
        FirebaseFirestore db=FirebaseFirestore.getInstance();
        DocumentReference docRef=db.collection("Health").document("params");
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if(task.isSuccessful()){
                    DocumentSnapshot document=task.getResult();;
                    if(document.exists()){
                         k=document.get("hr");
                    }
                }
            }
        });
        t.setText("56");
        String q=t3.getText().toString();
        String a=t4.getText().toString();

        int hr=56+38;
        int k=Integer.parseInt(q);
        int g=Integer.parseInt(a);
        int bmi=g*1000/(k*k);
        if(hr>128 && bmi>25){
            t6.setText("Based on Your Characteristics the recomended exercises are 1.Walking,2.Jogging,3.Cycling");

        }else{
            t6.setText("Based on Your Characteristics the recomended exercises are 1.Running,2.Swimming,3.Heavy Weights");

        }


    }

    @Override
    public void onBackPressed() {

        Intent i = new Intent(exercise.this, Dashboard.class);
        startActivity(i);
        finish();
        super.onBackPressed();

    }
}