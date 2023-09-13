package com.example.pr8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class product extends AppCompatActivity implements View.OnClickListener {
    Button otpr,poisk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        otpr = findViewById(R.id.button6);
        otpr.setOnClickListener(this);
        poisk = findViewById(R.id.button7);
        poisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:55.044006, 92.917401")));
            }
        });
    }
    @Override
    public void onClick(View view){
        startActivity(new Intent(this,basket.class));
    }
}