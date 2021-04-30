package com.example.movedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView fullname= (TextView) findViewById(R.id.textView4);
        EditText editView = (EditText) findViewById(R.id.editTextTextPersonName2);
        String username=getIntent().getStringExtra("usernamekey");
        String surname=getIntent().getStringExtra("surnamekey");
        fullname.setText(username+"  "+ surname);

        Button btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age= editView.getText().toString();
                Intent i = new Intent(MainActivity3.this, MainActivity4.class);
                Bundle b = new Bundle();
                b.putString("username",username);
                b.putString("surname", surname);
                b.putString("age",age);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}