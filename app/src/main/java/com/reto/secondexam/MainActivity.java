package com.reto.secondexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void ContentActivity(View view){
        Intent OpenActivityContent = new Intent(MainActivity.this, Activity_content.class);
        startActivity(OpenActivityContent);
    }

    public  void FormActivity(View view){
        Intent OpenActivityForm = new Intent(MainActivity.this, Activity_form.class);
        startActivity(OpenActivityForm);
    }


}
