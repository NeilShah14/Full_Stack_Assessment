package com.example.full_stack_assessment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


/**
 * Main Activity class holds the logic for the forecast btn
 * The forecast btn starts the ForecastActivity
 */
public class MainActivity extends AppCompatActivity {
    Button forButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //ToDO: Create the forecast button listener to transition to the next activity

        forButton = (Button)findViewById(R.id.forecast_button);
        forButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;
                intent  = new Intent(MainActivity.this, ForecastActivity.class);
                startActivity(intent);
            }
        });
    }
}