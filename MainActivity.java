package com.example.d1;

// Student Name : Ridhwan Salahuddin
// This Lab was done individually

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  buttonClicked(View v)
    {
        EditText w = (EditText) findViewById(R.id.weightBox);
        EditText h = (EditText) findViewById(R.id.heightBox);
        String wS = w.getText().toString();
        String hS = h.getText().toString();

        double wD = BMIModel.toDouble(wS);
        double hD = BMIModel.toDouble(hS);
        double bmiD = BMIModel.getBMI(wD, hD);
        String bmiS = BMIModel.formatBMI(bmiD);

        ((TextView) findViewById(R.id.answer)).setText(bmiS);
    }


}