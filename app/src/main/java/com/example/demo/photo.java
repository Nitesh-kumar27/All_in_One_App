package com.example.demo;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class photo extends AppCompatActivity {
    Button b1, b2;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        b1=(Button) findViewById(R.id.button36);
        b2=(Button) findViewById(R.id.button37);

        iv=(ImageView) findViewById(R.id.imageView24);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i, 100);
            }
        });
        b1.setOnClickListener(new
                                      View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(photo.this, camera_based_activity.class);
                startActivity(j);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==100){
            Bitmap bm=(Bitmap)data.getExtras().get("data");
            iv.setImageBitmap(bm);

        }
        else{
            Toast.makeText(this, "Camera is not working", Toast.LENGTH_SHORT).show();
        }
    }
}