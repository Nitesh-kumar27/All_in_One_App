package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class lightsensor extends AppCompatActivity  implements SensorEventListener {
    Button b1;
    MediaPlayer mp;
    SensorManager sensorManager;
    Sensor s;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lightsensor);
        b1=(Button) findViewById(R.id.button31);
        mp= MediaPlayer.create(this, R.raw.y);
        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        s=sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        sensorManager.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);
        iv=(ImageView)findViewById(R.id.imageView19);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                iv.setVisibility(View.INVISIBLE);
                Intent i=new Intent(lightsensor.this, sensor_based_app.class);
                startActivity(i);
                finish();
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.values[0]>1){
            mp.start();
            iv.setVisibility(View.VISIBLE);
            iv.setImageResource(R.drawable.green);
        }
        else{
            mp.pause();
            iv.setVisibility(View.VISIBLE);
            iv.setImageResource(R.drawable.red);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

}