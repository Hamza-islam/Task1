package com.hamza.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView myCounter;
    Button myDecrementBtn, myIncrementBtn, myResetBtn;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCounter = (TextView)findViewById(R.id.counterTextView);
        myIncrementBtn = (Button)findViewById(R.id.incrementCounter);
        myDecrementBtn = (Button)findViewById(R.id.decrementCounter);
        myResetBtn = (Button)findViewById(R.id.resetCounter);
        myCounter.setText(counter+"");
        myIncrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter<100) {
                counter++;
                myCounter.setText(counter+"");
                }
                else if(counter == 100) {
                    counter = counter;
                    myCounter.setText(counter+"");
                    Toast.makeText(MainActivity.this, "Max Value is 100", Toast.LENGTH_SHORT).show();
                }
            }
        });

        myDecrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(counter > 0) {
                    counter--;
                    myCounter.setText(counter+"");
                }else if(counter == 0) {
                    counter = counter;
                    myCounter.setText(counter+"");
                    Toast.makeText(MainActivity.this, "Min Value is 0", Toast.LENGTH_SHORT).show();
                }
            }
        });

        myResetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                myCounter.setText(counter+"");
                Toast.makeText(MainActivity.this, "Counter Reset", Toast.LENGTH_SHORT).show();
            }
        });
    }
}