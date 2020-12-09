package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LogInForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_form);
    }

    public void goToDashboard(View view) {

        Intent intent = new Intent(this, Dashboard.class);

        //three inputs from the log in form
        EditText usernameInput = (EditText) findViewById(R.id.input1);
        EditText passwordInput = (EditText) findViewById(R.id.input2);
        EditText emailIDInput = (EditText) findViewById(R.id.input3);

        //getting the user input in string format
        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();
        String emailID = emailIDInput.getText().toString();

        //generating the message for dashboard
        String message = "Welcome back " + username;
        intent.putExtra("MESSAGE", message);

        //next activity
        startActivity(intent);
    }
}