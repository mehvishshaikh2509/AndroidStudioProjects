package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    int i1;
    RadioGroup radioGroup;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        radioGroup = findViewById(R.id.three);
        t=(TextView) findViewById(R.id.textView12);
        Bundle b=getIntent().getExtras();
        i1 =b.getInt("res1");
        t.setText(String.valueOf(i1));
    }
    public  void  next3(View v)
    {
        int total=i1;
        switch (radioGroup.getCheckedRadioButtonId())
        {
            case  R.id.radioButton11:
                break;
            case  R.id.radioButton12:
                break;
            case  R.id.radioButton13:
                total=total+1;
                break;
            case  R.id.radioButton14:
                break;
        }
        Intent i3 = new Intent(MainActivity3.this, MainActivity4.class);
        Bundle b3 = new Bundle();
        b3.putInt("res2",total);
        i3.putExtras(b3);
        startActivity(i3);

    }
}