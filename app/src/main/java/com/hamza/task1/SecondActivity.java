package com.hamza.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    Button submitBtn;
    EditText myUserName, myPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_image);
        myUserName = (EditText) findViewById(R.id.userNameEdtTxt);
        myPassword = (EditText) findViewById(R.id.passwordEdtTxt);
        submitBtn = (Button) findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getUserName = myUserName.getText().toString();
                String getPassword = myPassword.getText().toString();
                Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                if (getUserName.equals("test") && getPassword.equals("123")) {
                    startActivity(myIntent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Username is invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}