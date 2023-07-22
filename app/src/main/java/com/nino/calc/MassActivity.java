package com.nino.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MassActivity extends LengthActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);
        setTitle("Mass Conversion");
    }
}