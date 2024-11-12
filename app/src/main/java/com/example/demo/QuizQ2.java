package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuizQ2 extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_q2);
        b1=(Button)findViewById(R.id.button43);
        r1=(RadioButton) findViewById(R.id.radioButton5);
        r2=(RadioButton) findViewById(R.id.radioButton6);
        r3=(RadioButton) findViewById(R.id.radioButton7);
        r4=(RadioButton) findViewById(R.id.radioButton8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r3.isChecked()){
                    QuizQ1.Score ++;
                }
                else{
                    QuizQ1.Score --;
                }
                Intent i=new Intent(QuizQ2.this, QuizQ3.class);
                startActivity(i);
                finish();
            }
        });
    }
}