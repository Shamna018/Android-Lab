package com.example.regsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Fname,Lname,gender;
    Button btnfetch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUI();
        btnfetch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchData();
            }
        });
    }

    private void initUI() {
        Fname=findViewById(R.id.t4);
        Lname=findViewById(R.id.t5);
        gender=findViewById(R.id.t6);
        btnfetch=findViewById(R.id.button2);
    }
    private void fetchData(){
        SharedPreferences sharedPref=getSharedPreferences("My_Pref", Context.MODE_PRIVATE);
        Fname.setText("First Name is "+sharedPref.getString("FNAME",""));
        Lname.setText("Last name is "+sharedPref.getString("LNAME",""));
        gender.setText("Gender is "+sharedPref.getString("GENDER",""));
    }
}
