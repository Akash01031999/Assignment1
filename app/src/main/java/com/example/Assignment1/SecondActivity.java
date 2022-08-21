package com.example.Assignment1;
import android.content.Intent;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       getSupportActionBar().hide();

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");
        String email = intent.getStringExtra("EMAIL");
        String Bdate = intent.getStringExtra("DATE");

        TextView Name = findViewById(R.id.Tvname);
        TextView Birthday = findViewById(R.id.TvBirth);
        TextView Email = findViewById(R.id.Tvemail);

        Name.setText(name);
        Email.setText(email);
        Birthday.setText(Bdate);

    }
}
