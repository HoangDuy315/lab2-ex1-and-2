package com.ck4u.lab2_ex1;



import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button redButton, greenButton, blueButton, grayButton;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        redButton = findViewById(R.id.button1);
        greenButton = findViewById(R.id.button2);
        blueButton = findViewById(R.id.button3);
        grayButton = findViewById(R.id.button4);
        linearLayout = findViewById(R.id.linearLayout);

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.RED);
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.GREEN);
            }
        });
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.BLUE);
            }
        });
        grayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linearLayout.setBackgroundColor(Color.GRAY);
            }
        });
    }
}