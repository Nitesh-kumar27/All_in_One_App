package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyMenu extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_menu);
        b1=(Button)findViewById(R.id.button7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MyMenu.this, calculator.class);
                startActivity(i);
                finish();
            }
        });
        b2=(Button) findViewById(R.id.button8);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j= new Intent(MyMenu.this, Text_to_Speech.class);
                startActivity(j);
                finish();
            }
        });
        b3=(Button) findViewById(R.id.button9);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(MyMenu.this, Wifi_app.class);
                startActivity(k);
                finish();
            }
        });
        b4=(Button) findViewById(R.id.button10);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l= new Intent(MyMenu.this, bluetooth_app.class);
                startActivity(l);
                finish();

                }
        });
        b5=(Button) findViewById(R.id.button11);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m= new Intent(MyMenu.this, media_player.class);
                startActivity(m);
                finish();
            }
        });
        b6=(Button) findViewById(R.id.button12);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n= new Intent(MyMenu.this, Torch_app.class);
                startActivity(n);
                finish();
            }
        });
        b7=(Button) findViewById(R.id.button13);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o= new Intent(MyMenu.this, sensor_based_app.class);
                startActivity(o);
                finish();
            }
        });
        b8=(Button) findViewById(R.id.button14);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p= new Intent(MyMenu.this, camera_based_activity.class);
                startActivity(p);
                finish();
            }
        });
        b9=(Button) findViewById(R.id.button15);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q= new Intent(MyMenu.this, web_browser.class);
                startActivity(q);
                finish();
            }
        });
        b10=(Button) findViewById(R.id.button16);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent r= new Intent(MyMenu.this, Quiz_app.class);
                startActivity(r);
                finish();
            }
        });
        b11=(Button) findViewById(R.id.button17);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent s= new Intent(MyMenu.this, Database_update.class);
                startActivity(s);
                finish();
            }
        });
        b12=(Button) findViewById(R.id.buttonP);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t= new Intent(MyMenu.this, Welcome_screen.class);
                startActivity(t);
                finish();
            }
        });
        b13=(Button) findViewById(R.id.buttonN);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u= new Intent(MyMenu.this, thankyou.class);
                startActivity(u);
                finish();
            }
        });


    }
}