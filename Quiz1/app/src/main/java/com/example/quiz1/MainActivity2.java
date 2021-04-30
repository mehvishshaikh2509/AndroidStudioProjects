package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView t;
    int i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        radioGroup = findViewById(R.id.two);
        t=(TextView) findViewById(R.id.textView8);
       Bundle b=getIntent().getExtras();
       i1 =b.getInt("res");
       t.setText(String.valueOf(i1));
       // statement to  replace the content of textview
    }

    public  void  next1(View v)
    {
        int total=i1;
        switch (radioGroup.getCheckedRadioButtonId())
        {
            case  R.id.radioButton5:
                break;
            case  R.id.radioButton6:
                break;
            case  R.id.radioButton7:
                total=total+1;
                break;
            case  R.id.radioButton8:
                break;
        }
        System.out.println(total);
        Intent i3 = new Intent(MainActivity2.this, MainActivity3.class);
        Bundle b3 = new Bundle();
        b3.putInt("res1",total);
        i3.putExtras(b3);
        startActivity(i3);

    }
}