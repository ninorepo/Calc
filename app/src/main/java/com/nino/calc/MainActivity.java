package com.nino.calc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.lcdStr = "0";
        TextView lcd = (TextView) findViewById(R.id.lcd);
        lcd.setText("0");
    }

    // option menu functions
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.opt_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.length_option){
            startActivity( new Intent(this, LengthActivity.class) );
        }
        else if( item.getItemId() == R.id.temperature_option) {
            startActivity(new Intent(this, TemperatureActivity.class));
        }
        else if( item.getItemId() == R.id.scientific_option) {
            startActivity(new Intent(this, ScientificActivity.class));
        }
        else if( item.getItemId() == R.id.mass_option) {
            startActivity(new Intent(this, MassActivity.class));
        }
        else if( item.getItemId() == R.id.currency_option) {
            startActivity(new Intent(this, CurrencyActivity.class));
        }
        else
            return false;
        return super.onOptionsItemSelected(item);
    }

    public void operatorClick(View v){
        Button b = (Button)v;
        TextView lcd = findViewById(R.id.lcd);
        String lcdString = lcd.getText().toString();
        lcd.setText(lcdString + b.getText().toString() );
    }

    public void numberClick(View v)
    {
        TextView lcd = findViewById(R.id.lcd);
        String lcdStr = lcd.getText().toString();
        Button b = (Button)v;
        String buttonStr = b.getText().toString();
        if(lcdStr == "0")
            lcdStr = "";
        lcd.setText(lcdStr + buttonStr);
    }

    public void clearClick(View v)
    {
        TextView lcd = findViewById(R.id.lcd);
        lcd.setText("0");
    }

    public void eraseClick(View v)
    {
        TextView lcd = findViewById(R.id.lcd);
        String lcdStr = "";
        lcdStr = lcd.getText().toString();
        if( (lcdStr == "0") || lcdStr.isEmpty() )
        {
            lcd.setText("0");
        }
        else{
            lcdStr = lcdStr.substring(0, lcdStr.length() - 1);
            lcd.setText(lcdStr);
        }
    }

    public void equalClick(View v)
    {
        TextView lcd = findViewById(R.id.lcd);
        String expression = lcd.getText().toString();
        Expression e = new Expression(expression);
        lcd.setText( Double.toString(e.calculate()) );
    }
}