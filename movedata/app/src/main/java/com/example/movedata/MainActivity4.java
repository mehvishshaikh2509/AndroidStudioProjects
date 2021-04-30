package com.example.movedata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity4 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView t1 =(TextView)findViewById(R.id.textView5) ;
        TextView t2=(TextView)findViewById(R.id.textView6) ;
        Bundle b=getIntent().getExtras();
        String s = b.getString("username");
        String s2 = b.getString("surname");
        String s3 = b.getString("age");
        t1.setText(s+ "  " + s2);
        t2.setText("Age: "+s3);


    }
}