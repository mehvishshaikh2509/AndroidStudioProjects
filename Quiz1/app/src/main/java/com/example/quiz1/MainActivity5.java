package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    int i1;
    RadioGroup radioGroup;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        radioGroup = findViewById(R.id.five);
        t=(TextView) findViewById(R.id.textView32);
        Bundle b=getIntent().getExtras();
        i1 =b.getInt("res3");
        t.setText(String.valueOf(i1));
    }
    public  void  next5(View v)
    {
        int total=i1;
        switch (radioGroup.getCheckedRadioButtonId())
        {
            case  R.id.radioButton31:
                total=total+1;
                break;
            case  R.id.radioButton32:
                break;
            case  R.id.radioButton33:
                break;
            case  R.id.radioButton34:
                break;
        }
        Intent i3 = new Intent(MainActivity5.this, MainActivity6.class);
        Bundle b3 = new Bundle();
        b3.putInt("res5",total);
        i3.putExtras(b3);
        startActivity(i3);

    }
}