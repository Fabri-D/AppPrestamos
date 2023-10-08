package com.example.proy15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity3 extends AppCompatActivity {

    ImageView iv2;
    TextView tv4,tv5,tv6,tv7,tv8,tv9,tv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        tv6 = findViewById(R.id.tv6);
        tv8 = findViewById(R.id.tv8);
        tv10 = findViewById(R.id.tv10);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            float monto = extras.getFloat("monto", 0.0f);
            float nroCuotas = extras.getFloat("nrocuotas", 0.0f);
            float cuota = extras.getFloat("cuota", 0.0f);


            tv6.setText(String.valueOf(monto));
            tv8.setText(String.valueOf(nroCuotas));
            tv10.setText(String.valueOf(cuota));
        }
    }
}