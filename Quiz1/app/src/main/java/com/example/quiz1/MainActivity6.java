package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    TextView t;
    int i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        t=(TextView) findViewById(R.id.textView54);
        Bundle b=getIntent().getExtras();
        i1 =b.getInt("res5");
        t.setText(String.valueOf(i1));
    }
}