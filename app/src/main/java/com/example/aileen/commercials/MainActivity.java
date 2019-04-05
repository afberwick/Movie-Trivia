package com.example.aileen.commercials;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button radio_Fleming = findViewById(R.id.radio_Fleming);
        Button gold = findViewById(R.id.gold);
        Button finch = findViewById(R.id.finch);
        Button brown = findViewById(R.id.brown);
        Button toupee = findViewById(R.id.toupee);
        Button notoupee = findViewById(R.id.notoupee);
        Button skis = findViewById(R.id.skis);
        Button noskis = findViewById(R.id.noskis);
        Button eng = findViewById(R.id.eng);
        Button noeng = findViewById(R.id.noeng);

        radio_Fleming.setOnClickListener(this);
        gold.setOnClickListener(this);
        finch.setOnClickListener(this);
        brown.setOnClickListener(this);
        toupee.setOnClickListener(this);
        notoupee.setOnClickListener(this);
        skis.setOnClickListener(this);
        noskis.setOnClickListener(this);
        eng.setOnClickListener(this);
        noeng.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.radio_Fleming:
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                break;
            case R.id.gold:
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
            case R.id.finch:
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
            case R.id.brown:
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
            case R.id.toupee:
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                break;
            case R.id.notoupee:
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
            case R.id.skis:
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                break;
            case R.id.noskis:
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
            case R.id.eng:
                Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                break;
            case R.id.noeng:
                Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}


