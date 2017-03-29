package com.example.usuario.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText primer, segundo, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primer=(EditText)findViewById(R.id.editText3);
        segundo=(EditText)findViewById(R.id.editText2);
        resultado=(EditText)findViewById(R.id.editText4);
    }

    public void sumar(View view) {
        String  valor1 = primer.getText().toString(),
                valor2 = segundo.getText().toString(),
                resu;
        int     nro1=Integer.parseInt(valor1),
                nro2=Integer.parseInt(valor2),
                suma=nro1+nro2;
        resu=String.valueOf(suma);
        resultado.setText(resu);
    }
}
