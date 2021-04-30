package com.example.movedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView surname = (TextView) findViewById(R.id.textView3);

        TextView tv= (TextView) findViewById(R.id.textView2);
        EditText editView = (EditText) findViewById(R.id.editTextTextPersonName3);
        Button btn = findViewById(R.id.button2);
        String username=getIntent().getStringExtra("userkey");
        tv.setText(username);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname1= editView.getText().toString();
                Intent i = new Intent(MainActivity2.this, MainActivity3.class);
                i.putExtra("usernamekey", username);
                i.putExtra("surnamekey", surname1);
                startActivity(i);
            }
        });


    }
}