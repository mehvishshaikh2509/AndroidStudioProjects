package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.one);
    }

    public  void  next(View v)
    {
        int total=0;
        switch (radioGroup.getCheckedRadioButtonId())
        {
            case  R.id.radioButton:
                break;
            case  R.id.radioButton2:
                total=total+1;
                break;
            case  R.id.radioButton3:
                break;
            case  R.id.radioButton4:
                break;
        }

        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putInt("res",total);
        i.putExtras(b);
        startActivity(i);

    }
}