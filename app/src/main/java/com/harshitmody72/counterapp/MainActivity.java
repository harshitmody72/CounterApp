package com.harshitmody72.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.harshitmody72.counterapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int qty = 0;
    private ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());

        setupEventHandlers();

    }

    private void setupEventHandlers() {
        b.incBtn.setOnClickListener(v -> incQty());
        b.decBtn.setOnClickListener(v -> decQty());
    }

    public void decQty() {
        b.qty.setText("" + --qty);
    }

    public void incQty() {
        b.qty.setText("" + ++qty);
    }
}