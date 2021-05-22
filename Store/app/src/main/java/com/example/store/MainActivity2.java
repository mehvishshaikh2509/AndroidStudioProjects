package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.welcome_name);
        e1 = findViewById(R.id.bname);
        e2 = findViewById(R.id.book_count);
        e3 = findViewById(R.id.cost_book);
        welcome();
    }
    void welcome(){
        String grettings = "Welcome in ";
        String str_name = getIntent().getExtras().getString("str_name");
        grettings += str_name;
        t1.setText(grettings);
    }
    public void next(View view){
        Intent i2 = new Intent(MainActivity2.this,MainActivity3.class);
        String bname,bcount,book_cost;
        bname = e1.getText().toString();
        bcount = e2.getText().toString();
        book_cost =e3.getText().toString();
        i2.putExtra("book_name",bname);
        i2.putExtra("book_count",bcount);
        i2.putExtra("Total_cost",String.valueOf(Integer.parseInt(bcount)*Integer.parseInt(book_cost)));
        startActivity(i2);
    }
}