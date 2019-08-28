package com.raven.calc20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    Button buttonSh;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String resl = intent.getStringExtra(buttons.N3);

        textView = findViewById(R.id.res);

   //     String result = String.valueOf(resl);

        textView.setText(resl);

        buttonSh = findViewById(R.id.share);
        buttonSh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = textView.getText().toString();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, message);
                intent.setType("text/plain");

                if (intent.resolveActivity(getPackageManager()) !=null){
                    startActivity(intent);
                }
            }
        });

    }
}
