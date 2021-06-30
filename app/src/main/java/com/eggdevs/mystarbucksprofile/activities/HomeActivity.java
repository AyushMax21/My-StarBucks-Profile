package com.eggdevs.mystarbucksprofile.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.eggdevs.mystarbucksprofile.R;

public class HomeActivity extends AppCompatActivity {

   TextView tvUserName;
   ImageView ivRestro;
   String email;
   String username;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.activity_home);

      tvUserName = findViewById(R.id.tvUserName);
      ivRestro = findViewById(R.id.ivRestro);

      Intent i = getIntent();
      email = i.getStringExtra("user_name");


      int indexOfAt = email.indexOf('@');
      username = email.substring(0, indexOfAt);
      tvUserName.setText(username); //Shift + Alt + up/down
   }
}