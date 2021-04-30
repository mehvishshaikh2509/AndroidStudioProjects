package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    int i1;
    RadioGroup radioGroup;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        radioGroup = findViewById(R.id.four);
        t=(TextView) findViewById(R.id.textView22);
        Bundle b=getIntent().getExtras();
        i1 =b.getInt("res2");
        t.setText(String.valueOf(i1));
    }
    public  void  next4(View v)
    {
        int total=i1;
        switch (radioGroup.getCheckedRadioButtonId())
        {
            case  R.id.radioButton21:
                break;
            case  R.id.radioButton22:
                total=total+1;
                break;
            case  R.id.radioButton23:
                break;
            case  R.id.radioButton24:
                break;
        }
        Intent i3 = new Intent(MainActivity4.this, MainActivity5.class);
        Bundle b3 = new Bundle();
        b3.putInt("res3",total);
        i3.putExtras(b3);
        startActivity(i3);

    }
}