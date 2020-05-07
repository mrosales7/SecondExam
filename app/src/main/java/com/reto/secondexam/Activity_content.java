package com.reto.secondexam;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Activity_content extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    public void EventToast(View view){
        Toast toast = Toast.makeText(getApplicationContext(),"Usted a seleccionado una imagen", Toast.LENGTH_LONG);
        toast.show();

    }


}
