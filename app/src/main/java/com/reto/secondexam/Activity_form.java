package com.reto.secondexam;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Activity_form extends AppCompatActivity {

    private Button BtnAlert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        BtnAlert =(Button) findViewById(R.id.BotonAlerta);
        BtnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta= new AlertDialog.Builder(Activity_form.this);
                alerta.setMessage("¿Desea salir de la aplicacion?")
                        .setCancelable(false)
                        .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog titulo= alerta.create();
                titulo.setTitle("Salida");
                titulo.show();
            }
        });

    }
    public void EventToastT(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"SUSCRIPCION A BEAR PRO", Toast.LENGTH_LONG);
        toast.show();

    }



}


