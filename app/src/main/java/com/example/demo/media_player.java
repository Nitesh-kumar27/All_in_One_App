package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class media_player extends AppCompatActivity {
    ImageButton i1;
    Button b1;
    MediaPlayer mp;
    private boolean work= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        i1=(ImageButton) findViewById(R.id.imageButton);
        b1=(Button) findViewById(R.id.button24);
        mp=MediaPlayer.create(this,R.raw.y);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(work==false){
                    i1.setImageResource(R.drawable.play);
                    mp.start();
                    work= true;
                }else{
                    i1.setImageResource(R.drawable.pause);
                    mp.pause();
                    work=false;
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
                Intent i= new Intent(media_player.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}