package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityMoyaFamilia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_moya_familia);

        String surname = getIntent().getStringExtra("Zhikharev");
        TextView textView = findViewById(R.id.textView);
        textView.setText("Переданный параметр: " + surname);
    }
}
