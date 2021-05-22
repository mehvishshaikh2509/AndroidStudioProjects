package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.str_number);
        e2 = findViewById(R.id.str_name);
        e3 = findViewById(R.id.str_address);
    }
    public void nextPage(View v){
        String name,number,address;
        number = e1.getText().toString();
        name = e2.getText().toString();
        address = e3.getText().toString();
       Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        i.putExtra("str_name",name);
        i.putExtra("str_number",number);
        i.putExtra("str_address",address);
        //myDbAdapter mydb = new myDbAdapter(this);
       // mydb.insertData(number,name,address);
        startActivity(i);
    }
}