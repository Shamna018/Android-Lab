package com.example.regsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText Fname,Lname;
    Button submit;
    RadioGroup gendergp;
    RadioButton male,female;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                regandnavi();
            }
        });
    }

    private void initUI() {
        Fname=findViewById(R.id.editTextTextPersonName);
        Lname=findViewById(R.id.editTextTextPersonName2);
        male=findViewById(R.id.radioButton);
        female=findViewById(R.id.radioButton2);
        gendergp=findViewById(R.id.radiogroup);
        submit= findViewById(R.id.button);

    }
    private void regandnavi(){
        SharedPreferences sharedPref=getSharedPreferences("My_Pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPref.edit();
        editor.putString("FNAME",Fname.getText().toString());
        editor.putString("LNAME",Lname.getText().toString());

        String radioValue="";
        switch(gendergp.getCheckedRadioButtonId()) {
            case R.id.radioButton: radioValue = "Male";
                break;
            case R.id.radioButton2: radioValue = "Female";
                break;
        }
        editor.putString("GENDER",radioValue);
        editor.apply();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);

        }
}