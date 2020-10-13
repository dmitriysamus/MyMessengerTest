package com.demo.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ArrivalTextMessage extends AppCompatActivity {
    private TextView textViewGetMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrival_text_message);
        Intent intent = getIntent();
        textViewGetMsg = findViewById(R.id.textViewGetMsg);
        String msg = intent.getStringExtra("msg");
        textViewGetMsg.setText(msg);

    }
}