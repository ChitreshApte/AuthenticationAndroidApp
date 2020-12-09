package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void goToDashboard(View view) {

        Intent intent = new Intent(this, Dashboard.class);

        //three inputs from the register form
        EditText usernameInput = (EditText) findViewById(R.id.input4);
        EditText passwordInput = (EditText) findViewById(R.id.input5);
        EditText emailIDInput = (EditText) findViewById(R.id.input6);

        //getting the user input in string format
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();
        String emailID = emailIDInput.getText().toString();

        //generating the message for dashboard
        String message = "Successfully registered " + username;
        intent.putExtra("MESSAGE", message);

        //next activity
        startActivity(intent);
    }
}