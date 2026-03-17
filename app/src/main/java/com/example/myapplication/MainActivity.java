package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textCount = findViewById(R.id.text_count);
        Button buttonToast = findViewById(R.id.button_toast);
        Button buttonCount = findViewById(R.id.button_count);

        buttonToast.setOnClickListener(v ->
                Toast.makeText(this, "Bonjour !", Toast.LENGTH_SHORT).show()
        );

        buttonCount.setOnClickListener(v ->
                textCount.setText(String.valueOf(++count))
        );
    }
}