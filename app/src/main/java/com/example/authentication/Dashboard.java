package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //this is the intent from the last page
        Intent intent = getIntent();
        //extracting the message from the last page
        String message = intent.getStringExtra("MESSAGE");

        //selecting the TextView to edit its text
        //user login - welcome back message
        //user register - successful register message
        TextView  myMessage = (TextView) findViewById(R.id.txt_msg);
        myMessage.setText(message);
    }

    public void goToHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}