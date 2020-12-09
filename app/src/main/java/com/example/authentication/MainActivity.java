package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Functionality for the login button on home page
    public void goToLoginPage(View view) {
        //clicking this button we go to the LogInForm
        Intent intent = new Intent(this, LogInForm.class);
        startActivity(intent);
    }

    //Functionality for the Register page
    public void goToRegisterPage(View view) {
        //clicking this button we go to the Register form
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}