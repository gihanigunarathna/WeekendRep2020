package com.example.weekend_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent i=getIntent();
        String s=i.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView v=findViewById(R.id.tvMessage);

        v.setText(s);

    }
}