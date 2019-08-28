package com.raven.calc20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class buttons extends AppCompatActivity {
    static final String N3 = "n3";
    Button buttonSum, buttonMin, buttonMul, buttonDiv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        Intent intent = getIntent();
        final String num1 = intent.getStringExtra(MainActivity.N1);
        final String num2 = intent.getStringExtra(MainActivity.N2);

        TextView textView = findViewById(R.id.znach);
        textView.setText("1) " + num1 + " 2) " + num2);

        buttonSum = findViewById(R.id.sum);
        buttonMin = findViewById(R.id.min);
        buttonMul = findViewById(R.id.mul);
        buttonDiv = findViewById(R.id.del);

        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(num1);
                double n2 = Double.valueOf(num2);
                double n3;
                n3 = n1+n2;
                String nu3 = String.valueOf(n3);
                String res = n1 + "+" + n2 + "="+ nu3;

                Intent intent = new Intent(buttons.this,Result.class);
                intent.putExtra(N3,res);
                startActivity(intent);

            }
        });

        buttonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(num1);
                double n2 = Double.valueOf(num2);
                double n3;
                n3 = n1-n2;
                String nu3 = String.valueOf(n3);
                String res = n1 + "-" + n2 + "="+ nu3;

                Intent intent = new Intent(buttons.this,Result.class);
                intent.putExtra(N3,res);
                startActivity(intent);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(num1);
                double n2 = Double.valueOf(num2);
                double n3;
                n3 = n1*n2;
                String nu3 = String.valueOf(n3);
                String res = n1 + "*" + n2 + "="+ nu3;

                Intent intent = new Intent(buttons.this,Result.class);
                intent.putExtra(N3,res);
                startActivity(intent);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double n1 = Double.valueOf(num1);
                double n2 = Double.valueOf(num2);
                double n3;
                n3 = n1/n2;
                String nu3 = String.valueOf(n3);
                String res = n1 + "/" + n2 + "="+ nu3;

                Intent intent = new Intent(buttons.this,Result.class);
                intent.putExtra(N3,res);
                startActivity(intent);
            }
        });



    }
}
