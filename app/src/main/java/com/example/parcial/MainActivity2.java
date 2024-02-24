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
    private Button btCalcular;
    private EditText txtNro1;
    private EditText txtNro2;

    private int precioTomate = 1000;
    private int precioCebolla = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtNro1 = findViewById(R.id.txtNro1);
        txtNro2 = findViewById(R.id.txtNro2);
        tvResultado = findViewById(R.id.tvResultado);
        btCalcular = findViewById(R.id.btMultiplicar);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularTotal();
            }
        });
    }
    public void calcularTotal() {
        int cantidadTomate = Integer.parseInt(txtNro1.getText().toString());
        int cantidadCebolla = Integer.parseInt(txtNro2.getText().toString());

        int totalTomate = cantidadTomate * precioTomate;
        int totalCebolla = cantidadCebolla * precioCebolla;

        int total = totalTomate + totalCebolla;

        tvResultado.setText(String.valueOf(total));
    }
}

