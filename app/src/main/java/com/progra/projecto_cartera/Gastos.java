package com.progra.projecto_cartera;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TimePicker;

import java.util.Calendar;

public class Gastos extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinner2;
    private EditText edt_n1, edt_fecha, edt_hora;
    private int dia,mes,año,hora,minutos;
    Button bfecha,bhora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gastos);


        //comunicacion con los edt y botones  de fecha y hora
        edt_fecha = (EditText)findViewById(R.id.edt_fecha);
        edt_hora = (EditText)findViewById(R.id.edt_hora);
        bfecha =(Button)findViewById(R.id.btnfecha);
        bhora = (Button)findViewById(R.id.btnhora);
        bfecha.setOnClickListener(this);
        bhora.setOnClickListener(this);

            //comunicacion con el spinner
        spinner2 = (Spinner)findViewById(R.id.spinazo2);

        String [] Tipos_gastos = {"Comida","Gasolina","Internet","Luz","Agua","Cable","Renta"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.spinner_item_spinners,Tipos_gastos);
        spinner2.setAdapter(adapter);

    }


    //metodo de los botones de fecha y hora

    @Override
    public void onClick(View v) {
        if(v == bfecha){
            final Calendar c= Calendar.getInstance();
            dia = c.get(Calendar.DAY_OF_MONTH);
            mes = c.get(Calendar.MONTH);
            año = c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    edt_fecha.setText(dayOfMonth + "/" + year);
                }
            }
                    ,dia,mes,año);
            datePickerDialog.show();
        }
        if(v == bhora){
            final Calendar c= Calendar.getInstance();
            hora = c.get(Calendar.HOUR_OF_DAY);
            minutos = c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    edt_hora.setText(hourOfDay + ":" + minute);
                }
            }
                    ,hora,minutos,false);
            timePickerDialog.show();
        }
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