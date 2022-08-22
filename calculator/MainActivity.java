package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum(View view) {
        EditText t1 = (EditText) findViewById(R.id.n1);
        EditText t2 = (EditText) findViewById(R.id.n2);
        Float x = Float.parseFloat(t1.getText().toString());
        Float y = Float.parseFloat(t2.getText().toString());
        Float z = x + y;
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText("The Sum is " + z);

    }

    public void subs(View view) {
        EditText t1 = (EditText) findViewById(R.id.n1);
        EditText t2 = (EditText) findViewById(R.id.n2);
        Float x = Float.parseFloat(t1.getText().toString());
        Float y = Float.parseFloat(t2.getText().toString());
        Float z = x - y;
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText("The Difference  is " + z);
    }

    public void multiplication(View view) {
        EditText t1 = (EditText) findViewById(R.id.n1);
        EditText t2 = (EditText) findViewById(R.id.n2);
        Float x = Float.parseFloat(t1.getText().toString());
        Float y = Float.parseFloat(t2.getText().toString());
        Float z = x * y;
        TextView t3 = (TextView) findViewById(R.id.textView3);
        t3.setText("The Product is " + z);
    }

    public void division(View view) {
        EditText t1 = (EditText) findViewById(R.id.n1);
        EditText t2 = (EditText) findViewById(R.id.n2);
        Float x = Float.parseFloat(t1.getText().toString());
        Float y = Float.parseFloat(t2.getText().toString());
        if (y == 0) {
            TextView t3 = (TextView) findViewById(R.id.textView3);
            t3.setText("The division is  not possible ");
        } else {
            Float z = x / y;
            TextView t3 = (TextView) findViewById(R.id.textView3);
            t3.setText("The Quotient is " + z);
        }
    }
}