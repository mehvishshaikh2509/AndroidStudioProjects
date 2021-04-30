package com.example.movedata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= (TextView) findViewById(R.id.textView);
        EditText editView = (EditText) findViewById(R.id.editTextTextPersonName);
        Button btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username= editView.getText().toString();
                Intent intent = new Intent(MainActivity.this , MainActivity2.class);
                intent.putExtra("userkey", username);
                startActivity(intent);
            }
        });
    }
}