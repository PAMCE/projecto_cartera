package com.progra.projecto_cartera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class Ingresos extends AppCompatActivity {

    public EditText edt_n1,edt_txt1;
    public Spinner spinner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);

        //comunicacion con el spinner
        spinner1 = (Spinner)findViewById(R.id.spinazo);

        String [] Tipos_ingreso = {"Ingreso activo","Ingreso pasivo"};

        ArrayAdapter <String> adapter = new ArrayAdapter<>(this,R.layout.spinner_item_spinners,Tipos_ingreso);
        spinner1.setAdapter(adapter);
    }




   //metodo para el boton de guardar fecha















    //metodos de los botones para navegar entre activitys
    public void Inicio (View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    public void Gasto (View view){
        Intent gasto = new Intent(this,Gastos.class);
        startActivity(gasto);
    }

    public void Movimientos (View view){
        Intent movimiento = new Intent(this,Movimientos.class);
        startActivity(movimiento);
    }

}