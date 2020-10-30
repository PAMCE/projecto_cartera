package com.progra.projecto_cartera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Gastos extends AppCompatActivity {

    public Spinner spinner2;
    public EditText edt_n1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);

            //comunicacion con el spinner
        spinner2 = (Spinner)findViewById(R.id.spinazo2);

        String [] Tipos_gastos = {"Comida","Gasolina","Internet","Luz","Agua","Cable","Renta"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.spinner_item_spinners,Tipos_gastos);
        spinner2.setAdapter(adapter);

    }
















    //metodos de los botones para navegar entre activitys
    public void Inicio (View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    public void Ingreso (View view){
        Intent ingreso = new Intent(this, Ingresos.class);
        startActivity(ingreso);
    }

    public void Movimientos (View view){
        Intent movimiento = new Intent(this,Movimientos.class);
        startActivity(movimiento);
    }


}