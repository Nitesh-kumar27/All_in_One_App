package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuizQ1 extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1;
    static int Score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_q1);
        b1=(Button) findViewById(R.id.button42);
        r1=(RadioButton) findViewById(R.id.radioButton);
        r2=(RadioButton) findViewById(R.id.radioButton2);
        r3=(RadioButton) findViewById(R.id.radioButton3);
        r4=(RadioButton) findViewById(R.id.radioButton4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r3.isChecked()){
                    Score++;
                }
                else{
                    Score--;
                }
                Intent i= new Intent(QuizQ1.this, QuizQ2.class);
                startActivity(i);
                finish();
            }
        });
    }
}