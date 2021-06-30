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
            int a = 7;
            password = etPassword.getText().toString();
            if (email.isEmpty() || password.isEmpty()) {
               Toast.makeText(MainActivity.this, "Please enter the credentials!", Toast.LENGTH_SHORT).show();
            } else {
               Intent i = new Intent(MainActivity.this, HomeActivity.class);

               i.putExtra("user_name", email);

               startActivity(i);
            }
         }
      });
   }
}