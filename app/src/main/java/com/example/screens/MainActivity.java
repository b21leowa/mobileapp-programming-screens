package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       loginButton = findViewById(R.id.login_button);
       username = findViewById(R.id.username);


       loginButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(!username.getText().toString().equals("")) {
                   Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                   intent.putExtra("username", username.getText().toString());
                   startActivity(intent);
                   Log.d("MainActivity", "Login Button pressed");
               }
           }
       });

    }
}
