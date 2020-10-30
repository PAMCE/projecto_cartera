package com.progra.projecto_cartera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Gastos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);
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