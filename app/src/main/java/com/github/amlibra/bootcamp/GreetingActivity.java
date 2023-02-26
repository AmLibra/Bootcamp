package com.github.amlibra.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String greeting = String.format(getString(R.string.greeting), name);
        TextView textView = findViewById(R.id.greetingName);
        if (textView != null)
            textView.setText(greeting);
    }
}