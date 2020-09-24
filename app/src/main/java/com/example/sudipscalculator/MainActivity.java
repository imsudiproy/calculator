package com.example.sudipscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1, number2;
    Button add, subtract, multiply, divide, percentage;

    double result_num;
    double num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result= (TextView)findViewById(R.id.Result);

        number1= (EditText)findViewById(R.id.number1);
        number2= (EditText)findViewById(R.id.number2);

        add=(Button)findViewById(R.id.Add);
        subtract=(Button)findViewById(R.id.subtract);
        multiply=(Button)findViewById(R.id.multiply);
        divide=(Button)findViewById(R.id.divide);
        percentage=(Button)findViewById(R.id.percentage);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1+num2;
                result.setText(String.valueOf(result_num));

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1-num2;
                result.setText(String.valueOf(result_num));

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1*num2;
                result.setText(String.valueOf(result_num));

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=num1/num2;
                result.setText(String.valueOf(result_num));

            }
        });
        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1=Double.parseDouble(number1.getText().toString());
                num2=Double.parseDouble(number2.getText().toString());
                result_num=(num1/num2)*100;
                result.setText(String.valueOf(result_num + "%"));

            }
        });
    }
}
