package com.raven.calc20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Receive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        Intent intent = getIntent();
        String recText = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView textView = findViewById(R.id.receive);
        textView.setText(recText);
    }
}
