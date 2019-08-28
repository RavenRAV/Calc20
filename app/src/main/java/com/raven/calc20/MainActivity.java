package com.raven.calc20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    static final String N1 = "n1";
    static final String N2 = "n2";

    EditText editTextNum1, editTextNum2;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNum1 = findViewById(R.id.num1);
        editTextNum2 = findViewById(R.id.num2);
        buttonNext = findViewById(R.id.next);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = editTextNum1.getText().toString();
                String num2 = editTextNum2.getText().toString();

                Intent intent = new Intent(MainActivity.this, buttons.class);
                intent.putExtra(N1, num1);
                intent.putExtra(N2, num2);

                startActivity(intent);

            }
        });


    }
}
