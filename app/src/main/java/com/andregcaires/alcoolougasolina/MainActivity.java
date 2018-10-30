package com.andregcaires.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editAlcool;
    private EditText editGasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAlcool = findViewById(R.id.txtAlcool);
        editGasolina = findViewById(R.id.txtGasolina);
        resultado = findViewById(R.id.txtResultado);
    }

    public boolean validaCampos(String alcool, String gas){


        return false;
    }

    public void calcularPreco(View view){

        try{
            float alcool = Float.parseFloat(editAlcool.getText().toString());
            float gasolina = Float.parseFloat(editGasolina.getText().toString());

            if(alcool <= 0 || gasolina <= 0){
                resultado.setText("Preencha os preços primeiro!");
            }
            else{
                float result = alcool / gasolina;
                if(result >= 0.7){
                    resultado.setText("Melhor abastecer com gasolina!");
                }
                else{
                    resultado.setText("Melhor abastecer com álcool!");
                }
            }

        }catch(Exception e){

        }

    }
}
