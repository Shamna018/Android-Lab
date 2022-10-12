package com.example.toggleimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int images[] ={R.drawable.pic1, R.drawable.s2};
    int currentindex=0;
    Button btn;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        img=findViewById(R.id.imageView2);

    }

    public void Click(View view) {
        currentindex();
    }

    private void currentindex() {
        switch(currentindex){
            case 0:img.setImageResource(images[1]);
                currentindex=1;
                break;
            case 1:img.setImageResource(images[0]);
                currentindex=0;
                break;

        }
    }
}