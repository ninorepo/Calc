package com.nino.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScientificActivity extends LengthActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific);
        setTitle("Scientific Calculator");
    }
}