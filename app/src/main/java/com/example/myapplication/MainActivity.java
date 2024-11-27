package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnViewExpenses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewExpenses = findViewById(R.id.btnViewExpenses);

        // Navigate to ViewExpensesActivity
        btnViewExpenses.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ViewExpensesActivity.class);
            startActivity(intent);
        });
    }
}