package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class bluetooth_app extends AppCompatActivity {
    ToggleButton t1;
    Button b1;
    BluetoothAdapter ba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_app);
        t1=(ToggleButton) findViewById(R.id.toggleButton);
        b1=(Button) findViewById(R.id.button23);
        ba=BluetoothAdapter.getDefaultAdapter();
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ba.enable();
                    Toast.makeText(bluetooth_app.this, "Bluetooth turn ON", Toast.LENGTH_SHORT).show();
                }
                else{
                    ba.disable();
                    Toast.makeText(bluetooth_app.this, "Bluetooth turn OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(bluetooth_app.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}