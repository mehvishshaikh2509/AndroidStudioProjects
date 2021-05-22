package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner=findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(this);

        List<String> depart = new ArrayList<String>();
        depart.add("Computer Science and Engineering");
        depart.add("Textile Engineering");
        depart.add("Civil Engineering");
        depart.add("Electrical Engineering");
        depart.add("Mechanical Engineering");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,depart);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Spinner state=findViewById(R.id.state);
        state.setOnItemSelectedListener(this);

        String st[]=getResources().getStringArray(R.array.state);
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,st);
        adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state.setAdapter(adapt);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();

        Toast.makeText(this, "You have Selected "+item, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}