package com.example.proy15;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout pantalla;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla=(ConstraintLayout) findViewById(R.id.pantalla);
        pantalla.setBackgroundResource(R.drawable.moni);
        btn1=(Button) findViewById(R.id.btn1);
    }
    public void iraact2(View v){
        Intent segunda=new Intent(this,activity2.class);
        startActivity(segunda);
    }
}