package com.example.myapplication;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText surfaceInput, piecesInput;
    private CheckBox piscineCheckbox;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surfaceInput = findViewById(R.id.input_surface);
        piecesInput = findViewById(R.id.input_pieces);
        piscineCheckbox = findViewById(R.id.checkbox_piscine);
        resultView = findViewById(R.id.result);

        findViewById(R.id.button_calcul).setOnClickListener(v -> calculer());
    }

    private void calculer() {
        String s = surfaceInput.getText().toString();
        String p = piecesInput.getText().toString();

        if (s.isEmpty() || p.isEmpty()) {
            Toast.makeText(this, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show();
            return;
        }

        double surface = Double.parseDouble(s);
        int pieces = Integer.parseInt(p);
        boolean piscine = piscineCheckbox.isChecked();

        double total = (surface * 2) + (pieces * 50) + (piscine ? 100 : 0);

        resultView.setText("Impôt total : " + total + " DH");
    }
}