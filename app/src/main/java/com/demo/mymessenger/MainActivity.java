package com.demo.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = findViewById(R.id.editTextForMessage);
    }

    public void msgForSent(View view) {
        String textMsg = msg.getText().toString();
        Intent intent = new Intent(this, ArrivalTextMessage.class);
        intent.putExtra("msg", textMsg);
        startActivity(intent);
    }
}