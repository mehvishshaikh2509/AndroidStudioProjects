package com.example.foregroundservice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button B1,B2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.ed);
        B1 = findViewById(R.id.b1);
        B2 = findViewById(R.id.b2);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input=e1.getText().toString();
                Intent serviceIntent = new Intent(MainActivity.this,ExampleService.class);
                serviceIntent.putExtra("inputExtra", input);
                startService(serviceIntent);
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent serviceIntent = new Intent(MainActivity.this,ExampleService.class);
                stopService(serviceIntent);

            }
        });

    }
}