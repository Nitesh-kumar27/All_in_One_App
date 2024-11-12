package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class QuizQ3 extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_q3);
        b1=(Button)findViewById(R.id.button44);
        r1=(RadioButton) findViewById(R.id.radioButton9);
        r2=(RadioButton) findViewById(R.id.radioButton10);
        r3=(RadioButton) findViewById(R.id.radioButton11);
        r4=(RadioButton) findViewById(R.id.radioButton12);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r3.isChecked()){
                    QuizQ1.Score++;
                }
                else{
                    QuizQ1.Score--;
                }
                Intent i= new Intent(QuizQ3.this , QuizResult.class);
                startActivity(i);
                finish();
            }
        });
    }
}