package com.nino.calc;

//import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TemperatureActivity extends LengthActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        setTitle("Temperature Conversion");
    }
}