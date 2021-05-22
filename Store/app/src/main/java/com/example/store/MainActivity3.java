package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView t1,t2,t3;
    String book_name,book_count,total_cost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        System.out.println("Entered activity 3");
        t1 = findViewById(R.id.textView);
        t2 = findViewById(R.id.textView4);
        t3 = findViewById(R.id.textView5);
        book_name = getIntent().getExtras().getString("book_name");
        book_count = getIntent().getExtras().getString("book_count");
        total_cost = getIntent().getExtras().getString("Total_cost");
        displayData();
    }
    public void displayData(){
        t1.setText("Book Name = "+book_name);
        t2.setText("Book Count = "+book_count);
        t3.setText("Total Cost = "+total_cost);
      //  t1.setTextColor(getResources().getColor(R.color.pink));
      //  t2.setTextColor(getResources().getColor(R.color.yellow));
      //  t3.setTextColor(getResources().getColor(R.color.orange));
    }
}