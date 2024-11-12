package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Wifi_app extends AppCompatActivity {
    ImageButton i1;
    Button b1;
    WifiManager wb;
    private boolean wifi= false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi_app);
        i1=(ImageButton) findViewById(R.id.imageButton7);
        b1=(Button) findViewById(R.id.button22);
        wb=(WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!wifi){
                    wb.setWifiEnabled(true);
                    wifi =true;
                    i1.setImageResource(R.drawable.on);
                    Toast.makeText(Wifi_app.this, "Wifi turn ON", Toast.LENGTH_SHORT).show();
                }
                else{
                    wb.setWifiEnabled(false);
                    wifi=false;
                    i1.setImageResource(R.drawable.off);
                    Toast.makeText(Wifi_app.this, "Wifi turn OFF", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Wifi_app.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}