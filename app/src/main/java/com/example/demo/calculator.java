package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class calculator extends AppCompatActivity {
    EditText e1, e2;
    Button b1;
    ImageButton i1, i2, i3, i4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        e1=(EditText) findViewById(R.id.editTextTextPersonName5);
        e2=(EditText) findViewById(R.id.editTextTextPersonName6);
        t1=(TextView) findViewById(R.id.textView);
        i1=(ImageButton) findViewById(R.id.imageButton3);
        i2=(ImageButton) findViewById(R.id.imageButton4);
        i3=(ImageButton) findViewById(R.id.imageButton5);
        i4=(ImageButton) findViewById(R.id.imageButton6);
        b1=(Button) findViewById(R.id.button19);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1/two1;
                        String result1=Float.toString(result);
                        String massage = "your result is ";
                        t1.setText( massage + result1);
                    }
                }
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1*two1;
                        String result1=Float.toString(result);
                        String massage = "your result is ";
                        t1.setText( massage + result1);
                    }
                }
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1+two1;
                        String result1=Float.toString(result);
                        String massage = "your result is ";
                        t1.setText( massage + result1);
                    }
                }
            }
        });
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one= e1.getText().toString();
                String two= e2.getText().toString();
                if(one.isEmpty()){
                    e1.setError("Enter a number");
                }else {
                    if(two.isEmpty()){
                        e2.setError("Enter a number");
                    }
                    else{
                        Float one1= Float.parseFloat(one);
                        Float two1= Float.parseFloat(two);
                        float result= one1-two1;
                        String result1=Float.toString(result);
                        String massage = "your result is: ";
                        t1.setText( massage+result1);
                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(calculator.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });

    }
}