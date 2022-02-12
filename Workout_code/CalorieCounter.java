package com.example.stayfit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.stayfit.Model.Food;
import com.example.stayfit.ViewHolder.CategoryViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class CalorieCounter extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference category;
    RecyclerView recycler_menu;
    RecyclerView.LayoutManager layoutManager;
    Double count=0.0;
    Button reset;
    Button addelement;
    TextView caltext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);
        reset=(Button)findViewById(R.id.reset);
        addelement=(Button)findViewById(R.id.addelement);
        caltext = (TextView) findViewById(R.id.caltext);
        //Init Firebase
        database = FirebaseDatabase.getInstance();
        category = database.getReference("Food");
        //Load Menu
        recycler_menu = (RecyclerView) findViewById(R.id.recycler_menu);
        recycler_menu.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recycler_menu.setLayoutManager(layoutManager);
        loadCategory();

        addelement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent choose = new Intent(CalorieCounter.this,Add.class);
                startActivity(choose);
                finish();
            }
        });
    }

    private void loadCategory()
    {
        FirebaseRecyclerAdapter<Food,CategoryViewHolder> adapter = new FirebaseRecyclerAdapter<Food,CategoryViewHolder>(Food.class,R.layout.category_item,CategoryViewHolder.class,category)

        {
            @Override
            protected  void populateViewHolder(CategoryViewHolder viewHolder, Food model, int position){

                viewHolder.txtCategoryName.setText(model.getName());
                viewHolder.txtCategoryMeasure.setText(model.getMeasure());

                final Food clickItem = model;
                viewHolder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View view, int position, boolean isLongClick) {

                        String label,label2;
                        String cal=clickItem.getCal();
                        float calorie=Float.parseFloat(cal);
                        count+=calorie;
                        label = "Your Total Calories: ";
                        label2 = label + count;
                        caltext.setText(label2);
                        Toast.makeText(CalorieCounter.this,""+clickItem.getName() + " Calories: " +clickItem.getCal(),Toast.LENGTH_SHORT).show();

                    }
                });
                reset.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        count=0.0;
                        caltext.setText("");
                        Toast.makeText(CalorieCounter.this, "CALORIE RESET", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        };
        recycler_menu.setAdapter(adapter);
    }

}


