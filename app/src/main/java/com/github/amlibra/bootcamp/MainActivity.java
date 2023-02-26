package com.github.amlibra.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGreetingActivity(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        TextView nameView = findViewById(R.id.mainName);
        String name = nameView.getText().toString();
        intent.putExtra("name", name);
        startActivity(intent);
    }
}