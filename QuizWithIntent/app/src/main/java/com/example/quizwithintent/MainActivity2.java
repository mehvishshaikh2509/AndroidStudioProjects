package com.example.quizwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    int score;
    Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in = getIntent();
        Bundle b = in.getExtras();
        score = b.getInt("result");
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);
        btn4 = findViewById(R.id.b4);
    }


    public void check(View v) {


        switch (v.getId())
        {
            case R.id.b1:
                btn1.setBackgroundColor(Color.GREEN);
                score++;
                break;

            case R.id.b2:
                btn2.setBackgroundColor(Color.RED);
                btn1.setBackgroundColor(Color.GREEN);

                break;

            case R.id.b3:
                btn3.setBackgroundColor(Color.RED);
                btn1.setBackgroundColor(Color.GREEN);
                break;

            case R.id.b4:
                btn4.setBackgroundColor(Color.RED);
                btn1.setBackgroundColor(Color.GREEN);
                break;

        }

        int finalScore = score;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent in=new Intent(MainActivity2.this, MainActivity3.class);
                in.putExtra("result", finalScore);
                startActivity(in);
            }
        }, 2000);

    }
}