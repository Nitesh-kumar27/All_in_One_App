package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registration extends AppCompatActivity {
    EditText e1, e2;
    Button b1,b2;
    ProgressBar pb;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        e1=(EditText) findViewById(R.id.editTextTextPersonName3);
        e2=(EditText) findViewById(R.id.editTextTextPersonName4);
        e2.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        b1=(Button) findViewById(R.id.button3);
        b2=(Button) findViewById(R.id.button4);
        pb=(ProgressBar) findViewById(R.id.progressBar1);
        firebaseAuth= FirebaseAuth.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=e1.getText().toString();
                String password=e2.getText().toString();
                if(password.length()<6){
                    e2.setError("Password must be greater then six characters");
                }
                if(email.isEmpty()){
                    e1.setError("Enter your email");
                }
                else{
                    if(password.isEmpty()){
                        e2.setError("Enter your password");
                    }
                    else{
                        pb.setVisibility(View.VISIBLE);
                        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Registration.this, "Registration successful", Toast.LENGTH_SHORT).show();
                                    pb.setVisibility(View.INVISIBLE);
                                    Intent j=new Intent(Registration.this, MainActivity.class);
                                    startActivity(j);
                                    finish();
                                }
                                else{
                                    pb.setVisibility(View.INVISIBLE);
                                    Toast.makeText(Registration.this, "Registration unsuccessful\nTry again with different email", Toast.LENGTH_SHORT).show();
                                }

                            }
                        });
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Registration.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}