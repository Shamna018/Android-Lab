package com.example.exception;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;
    TextView tv;
    String items1[] = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
    String items[]={"0","1","2","3","4","5","6"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.activity_list_view);
        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        list.setAdapter(arrayAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String Item=(String) adapterView.getItemAtPosition(i);
                try {
                    Toast.makeText(getApplicationContext(),items1[Integer.parseInt(Item)] , Toast.LENGTH_SHORT).show();

                }catch (ArrayIndexOutOfBoundsException e){
                    Toast.makeText(getApplicationContext(),e.toString() , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}