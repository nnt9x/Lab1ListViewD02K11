package com.bkacad.nnt.lab1listviewd02k11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();
        Country  country = (Country) intent.getSerializableExtra("country");
        Toast.makeText(this, country.toString(), Toast.LENGTH_SHORT).show();
    }
}