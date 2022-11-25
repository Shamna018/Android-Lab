package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images={R.drawable.img2,R.drawable.img2,R.drawable.img2,R.drawable.img2,R.drawable.img2,R.drawable.img2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=findViewById(R.id.grid_view);

        GridAdapter gridAdapter=new GridAdapter(this,images);
        gridView.setAdapter(gridAdapter);


    }
}