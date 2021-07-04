package com.eggdevs.mystarbucksprofile.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.eggdevs.mystarbucksprofile.R;

public class MainActivity extends AppCompatActivity {

   EditText etPassword, etEmail;
   Button btnSignUp;
   String email, password;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);

      etPassword = findViewById(R.id.etPassword);
      etEmail = findViewById(R.id.etEmail);
      btnSignUp = findViewById(R.id.btnSignUp);

      btnSignUp.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            email = etEmail.getText().toString();
            password = etPassword.getText().toString();
            if (email.isEmpty() || password.isEmpty()) {
               Toast.makeText(MainActivity.this, "Please enter the credentials!", Toast.LENGTH_SHORT).show();
            } else {

               if (email.contains("@")) {
                  int indexOfAt = email.indexOf('@');

                  String domain = email.substring(indexOfAt+1);
                  String restOfString = email.substring(0, indexOfAt);

                  if (restOfString.length() > 0 &&
                          (domain.equals("gmail.com") || domain.equals("yahoo.com") || domain.equals("yahoo.in"))) {
                     Intent i = new Intent(MainActivity.this, HomeActivity.class);

                     i.putExtra("user_name", email);

                     startActivity(i);
                     finish();
                  }
                  else {
                     Toast.makeText(MainActivity.this, "Check the order of the string!", Toast.LENGTH_SHORT).show();
                  }

               }
               else {
                  Toast.makeText(MainActivity.this, "Please enter a valid email!", Toast.LENGTH_SHORT).show();
               }
            }
         }
      });
   }
}