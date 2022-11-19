package com.example.explicitintent;

import static com.example.explicitintent.R.id.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView tv;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        tv=findViewById(R.id.textView);

    }

    public void button(View view) {
        Intent i=new Intent(this,MainActivity2.class);
        startActivity(i);
    }
}

