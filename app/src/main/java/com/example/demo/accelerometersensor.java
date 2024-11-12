package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class accelerometersensor extends AppCompatActivity implements SensorEventListener {
    Button b1;
    SensorManager sensorManager;
    Sensor s;
    MediaPlayer mp;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometersensor);
        b1=(Button) findViewById(R.id.button32);
        sensorManager=(SensorManager) getSystemService(SENSOR_SERVICE);
        s=sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, s,SensorManager.SENSOR_DELAY_NORMAL);
        iv=(ImageView)findViewById(R.id.imageView20);
        mp=MediaPlayer.create(this, R.raw.y);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                iv.setVisibility(View.INVISIBLE);
                Intent i= new Intent(accelerometersensor.this , sensor_based_app.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float x=sensorEvent.values[0];
        float y=sensorEvent.values[1];
        float z=sensorEvent.values[2];
        int x1=(int)x;
        int y1=(int)y;
        int z1=(int)z;
        if(x1!=0){
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