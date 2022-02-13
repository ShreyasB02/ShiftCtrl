package com.example.yo7a.healthwatcher;

import android.content.Intent;
import android.os.Bundle;
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

public class O2Result extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    private String user, Date;
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    Date today = Calendar.getInstance().getTime();
    int O2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o2_result);
        Date = df.format(today);
        TextView RO2 = this.findViewById(R.id.O2R);
        ImageButton SO2 = this.findViewById(R.id.SendO2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            O2 = bundle.getInt("O2R");
            user = bundle.getString("Usr");
            RO2.setText(String.valueOf(O2));
        }

    }

        public void savetofirestore(int i) {
            HashMap<String, String> map = new HashMap<>();
            map.put("os", String.valueOf(O2));
            db.collection("Health").document("params").set(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(O2Result.this, "Data Saved ", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(O2Result.this, Dashboard.class);
                        startActivity(i);
                        finish();
                    }

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(O2Result.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            });

        }




    @Override
    public void onBackPressed() {

        Intent i = new Intent(O2Result.this, Dashboard.class);
        i.putExtra("Usr", user);
        startActivity(i);
        finish();
        super.onBackPressed();

    }
}
