package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    double totalBill;
    int desktopper;

    public void billandtip(View v){
        SeekBar seekBar = findViewById(R.id.seekBar);
        EditText billEdit = (EditText) findViewById(R.id.billEdit);
        EditText qualityEdit = (EditText) findViewById(R.id.qualityEdit);
        TextView tipFind = (TextView) findViewById(R.id.tipFind);
        TextView billFind = (TextView) findViewById(R.id.billFind);

        int bill = Integer.parseInt(billEdit.getText().toString());
        int quality = Integer.parseInt(qualityEdit.getText().toString());

        double tip = bill * (quality * 0.01);
        totalBill = bill + tip;

        tipFind.setText("Tip: $" + tip);
        billFind.setText("Total Bill: $" + totalBill);
    }

    public void donation(View v) {
        totalBill = totalBill + 5;
        TextView billDonation = (TextView) findViewById(R.id.billDonation);
        billDonation.setText("New Bill: $" + totalBill);
    }

    }
