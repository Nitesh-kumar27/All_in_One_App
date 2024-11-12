package com.example.demo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class Torch_app extends AppCompatActivity {
    ToggleButton t1;
    CameraManager cm;
    Button b1;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch_app);
        t1=(ToggleButton) findViewById(R.id.toggleButton2);
        cm=(CameraManager)getSystemService(CAMERA_SERVICE);
        b1=(Button) findViewById(R.id.button25);
        t1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    try {
                        String s = cm.getCameraIdList()[0];
                        cm.setTorchMode(s, true);
                    } catch (CameraAccessException e) {
                    }
                } else {
                    try {
                        String s = cm.getCameraIdList()[0];
                        cm.setTorchMode(s, false);
                    } catch (CameraAccessException e) {

                    }
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Torch_app.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });

    }
}