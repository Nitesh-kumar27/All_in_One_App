package com.example.demo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Video extends AppCompatActivity {
    Button b1,b2;
    VideoView v1;
    Uri u1;
    MediaController m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        b1=(Button) findViewById(R.id.button39);
        b2=(Button) findViewById(R.id.button38);
        v1=(VideoView) findViewById(R.id.videoView);
        m1=new MediaController(this);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Video.this, camera_based_activity.class);
                startActivity(i);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setVisibility(View.VISIBLE);
                Intent j=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(j, 100);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100){
            u1=data.getData();
            v1.setVideoURI(u1);
            v1.setMediaController(m1);
            m1.setAnchorView(v1);
            v1.start();
        }
        else{
            Toast.makeText(this, "Camera is not working", Toast.LENGTH_SHORT).show();
        }
    }
}