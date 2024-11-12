package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuizResult extends AppCompatActivity {
    Button b1;
    TextView e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);
        b1=(Button)findViewById(R.id.button45);
        e1=(TextView)findViewById(R.id.textView15);
        e1.setText("Your score is "+ QuizQ1.Score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(QuizResult.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}