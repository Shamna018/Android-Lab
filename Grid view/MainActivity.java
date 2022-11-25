package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images={R.drawable.f6,R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.grid_view);

        GridAdapter gridAdapter=new GridAdapter(this,images);
        gridView.setAdapter(gridAdapter);


    }
}