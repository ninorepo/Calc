package com.nino.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CurrencyActivity extends LengthActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        setTitle("Currency Conversion");
    }
}