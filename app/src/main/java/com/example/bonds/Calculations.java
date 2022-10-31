package com.example.bonds;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculations extends AppCompatActivity {

    private EditText coupon,denomination, price;
    private Button calcutions_Bonds;
    private TextView couponYield,currentYield;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculations);

        coupon = findViewById(R.id.coupon);
        denomination = findViewById(R.id.denomination);
        price = findViewById(R.id.price);
        couponYield = findViewById(R.id.couponYield);
        currentYield = findViewById(R.id.currentYield);
        calcutions_Bonds = findViewById(R.id.calcutionsBonds);

        calcutions_Bonds.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num_1 = Float.parseFloat(coupon.getText().toString());
                float num_2 = Float.parseFloat(denomination.getText().toString());
                float num_3 = Float.parseFloat(price.getText().toString());
                float res_1 = (num_1/num_2)*100;
                float res_2 = (num_1/num_3)*100;
                couponYield.setText(String.valueOf(res_1 + " %"));
                currentYield.setText(String.valueOf(res_2 + " %"));
            }
        });


    }
}