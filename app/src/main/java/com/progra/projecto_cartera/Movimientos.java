package com.progra.projecto_cartera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Movimientos extends AppCompatActivity {

    private Spinner spinner1,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimientos);


        //comunicacion con el spinner
        spinner1 = (Spinner)findViewById(R.id.spinazo3);
        spinner2 = (Spinner)findViewById(R.id.spinazo4);


        String [] Mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio",
                "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.spinner_item_spinners,Mes);
        spinner1.setAdapter(adapter);

        String [] Categoria = {"Todo","Ingresos","Gastos"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this,R.layout.spinner_item_spinners,Categoria);
        spinner2.setAdapter(adapter1);


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

    public void Gasto (View view){
        Intent gasto = new Intent(this,Gastos.class);
        startActivity(gasto);
    }
}