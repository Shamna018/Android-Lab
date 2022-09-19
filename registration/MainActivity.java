package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname,password;
    Button btn;
    RadioGroup gender;
    RadioButton male,female;
    Switch newmember;
    CheckBox agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=findViewById(R.id.fn);
        lname=findViewById(R.id.ln);
        password=findViewById(R.id.psw);
        btn=findViewById(R.id.btn);
        gender=findViewById(R.id.rg);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        newmember=findViewById(R.id.newmember);
        agree=findViewById(R.id.agree);


    }

    public void submit(View view) {
        if(validate()){
            Toast.makeText(this, "Registration is Successfull !", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Registration Failed !", Toast.LENGTH_SHORT).show();
        }

    }

    private boolean validate() {
        boolean isvalid=false;
        String lastname,firstname;
        firstname=fname.getText().toString();
        lastname=lname.getText().toString();

        if(firstname.equals("")){
            Toast.makeText(this, "First name is Empty !", Toast.LENGTH_SHORT).show();
        }
        else if(lastname.equals("")){
            Toast.makeText(this, "Last name is Empty !", Toast.LENGTH_SHORT).show();
        }
        else if(!male.isChecked() && !female.isChecked()){
            Toast.makeText(this, "Please choose the Gender !", Toast.LENGTH_SHORT).show();
        }
        else if (password.length()<3){
            Toast.makeText(this, "Password should have atleast  characters !", Toast.LENGTH_SHORT).show();
        }
        else if (!newmember.isChecked()){
            Toast.makeText(this, "Switch on To New Member", Toast.LENGTH_SHORT).show();
        }
        else if(!agree.isChecked()){
            Toast.makeText(this, "Agree the Terms And Conditions !", Toast.LENGTH_SHORT).show();
        }
        else{
           isvalid=true;
        }
        return isvalid;
    }
}