package com.example.yo7a.healthwatcher;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;


public class HeartRateResult extends AppCompatActivity {
 private FirebaseFirestore db=FirebaseFirestore.getInstance();
    private String user, Date;
    int HR;
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    Date today = Calendar.getInstance().getTime();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate_result);

        Date = df.format(today);
        TextView RHR = this.findViewById(R.id.HRR);
        ImageButton SHR = this.findViewById(R.id.SendHR);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            HR = bundle.getInt("bpm");
            savetofirestore(HR);
            user = bundle.getString("Usr");
            Log.d("DEBUG_TAG", "ccccc" + user);
            RHR.setText(String.valueOf(HR));
        }



    }
    public void savetofirestore(int i){
        HashMap<String,String>map=new HashMap<>();
        map.put("hr",String.valueOf(HR));
        db.collection("Health").document("params").set(map).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Toast.makeText(HeartRateResult.this,"Data Saved ",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(HeartRateResult.this,Dashboard.class);
                    startActivity(i);
                    finish();
                }

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(HeartRateResult.this,"Failed",Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent i = new Intent(HeartRateResult.this, Primary.class);
        i.putExtra("Usr", user);
        startActivity(i);
        finish();
    }
}
