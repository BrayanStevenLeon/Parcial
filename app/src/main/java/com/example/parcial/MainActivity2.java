package com.example.parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import org.w3c.dom.Text;


public class MainActivity2 extends AppCompatActivity {
    private TextView tvResultado;
    private Button btMultiplicar;
    private EditText txtNro1;
    private EditText txtNro2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtNro1 = findViewById(R.id.txtNro1);
        txtNro2 = findViewById(R.id.txtNro2);
        tvResultado = findViewById(R.id.tvResultado);
        btMultiplicar = findViewById(R.id.btMultiplicar);

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicar();
            }
        });
    }
    public void multiplicar(){
        int valor1 = Integer.parseInt(txtNro1.getText().toString());
        int valor2 = Integer.parseInt(txtNro2.getText().toString());
        tvResultado.setText(String.valueOf(valor1*valor2));
    }

}

