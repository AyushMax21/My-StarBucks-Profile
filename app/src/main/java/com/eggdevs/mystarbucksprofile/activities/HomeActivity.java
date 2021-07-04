package com.eggdevs.mystarbucksprofile.activities;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eggdevs.mystarbucksprofile.R;

import java.util.Arrays;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

   TextView tvUserName;
   ImageView ivRestro;
   String email;
   String username;
   LinearLayout background;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      setContentView(R.layout.activity_home);

      tvUserName = findViewById(R.id.tvUserName);
      ivRestro = findViewById(R.id.ivRestro);
      background = findViewById(R.id.background);

      Intent i = getIntent();
      email = i.getStringExtra("user_name");

      int indexOfAt = email.indexOf('@');
      username = email.substring(0, indexOfAt);
      tvUserName.setText(username); //Shift + Alt + up/down

      int arrayOfImages[] = {R.drawable.st1, R.drawable.st2, R.drawable.st3, R.drawable.st4};
      int random = (int)(Math.random() * 4);

//      ivRestro.setImageResource(arrayOfImages[random]);
      background.setBackgroundResource(arrayOfImages[random]);

      Arrays.sort(arrayOfImages);


   } //ctrl + P

   /*void sort(int a[], int n) {
      //selection, insertion, bubble, merge, quick, radix

      //complex: it uses lots and lots android
   }

   int linearSearch(int a[], int x) {
      for (int i = 0; i < a.length; i++)
         if (a[i] == x) return i;  //c++
      return -1;
   }

   // when array is sorted.
   int binary(int a[], int x) {
      int low = 0, high = a.length - 1;
      while (low <= high) {
         int mid = (low + high) /2;
         if (a[mid] == x) return mid;
         else if (a[mid] < x) low = mid + 1;
         else high = mid - 1;
      }
      return -1;
   }*/

}