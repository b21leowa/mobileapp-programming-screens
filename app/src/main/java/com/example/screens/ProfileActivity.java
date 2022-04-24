package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    Button logoutButton;
    TextView username, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Bundle extras = getIntent().getExtras();

        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        logoutButton = findViewById(R.id.logout_button);

        if(extras != null) {
            String usernameString = extras.getString("username");
            String emailString = usernameString + "@gmail.com";
            username.setText(usernameString);
            email.setText(emailString);
        }

        logoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}