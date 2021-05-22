package com.example.quizwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;
    //TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);

    }

    public  void check(View v)
    {
        int score = 0;

        switch (v.getId())
        {
            case R.id.b1:
                btn1.setBackgroundColor(Color.RED);
                btn2.setBackgroundColor(Color.GREEN);
                break;

            case R.id.b2:
                btn2.setBackgroundColor(Color.GREEN);
                score++;
                break;

            case R.id.b3:
                btn3.setBackgroundColor(Color.RED);
                btn2.setBackgroundColor(Color.GREEN);
                break;

            case R.id.b4:
                btn4.setBackgroundColor(Color.RED);
                btn2.setBackgroundColor(Color.GREEN);
                break;

        }

        int finalScore = score;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent in=new Intent(MainActivity.this, MainActivity2.class);
                in.putExtra("result", finalScore);
                startActivity(in);
            }
        }, 2000);

    }
}