package com.example.proy15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    ImageView iv1;
    TextView tv1,tv2,tv3;
    EditText et1,et2;
    Button btn2;
    float a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        iv1=(ImageView) findViewById(R.id.iv1);
        tv1=(TextView) findViewById(R.id.tv1);
        tv2=(TextView) findViewById(R.id.tv2);
        tv3=(TextView) findViewById(R.id.tv3);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        btn2=(Button) findViewById(R.id.btn2);
    }



    public void calcularcuota(View v){
        a=Float.parseFloat(et1.getText().toString());
        b=Float.parseFloat(et2.getText().toString());

        if (b<=12){
            c=a+a*0.55f;
        }
        if ((b>=13) && (b<=24)){
            c=a+a*0.89f;
        }
        if ((b>=25) && (b<=36)){
            c=a+a*1.30f;
        }
        if (b>36){
            c=a+a*2;
        }

        c /= b;

        Intent tercera=new Intent(this,activity3.class);
        tercera.putExtra("monto",a);
        tercera.putExtra("nrocuotas",b);
        tercera.putExtra("cuota",c);
        startActivity(tercera);
    }
}