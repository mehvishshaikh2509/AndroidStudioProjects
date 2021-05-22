package com.example.quizwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    TextView t;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Intent in = getIntent();
        Bundle b = in.getExtras();
        score = b.getInt("result");
        t = findViewById(R.id.t1);
        t.setText("Your Score is : "+score);
    }
}