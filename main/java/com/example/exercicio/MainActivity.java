package com.example.exercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt1,edt2;
    TextView txt1,txt2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        btn = findViewById(R.id.btn);
    }
            public void onClick(View v) {
                int idade =Integer.parseInt(edt1.getText().toString());
                int ida=Integer.parseInt(edt2.getText().toString());
               edt1.getText();
               edt2.getText();
                txt1.setText("A sua idade actual é "+ (ida-idade));
                txt2.setText("Em 2050 terás " +(2050-idade));
            }
}