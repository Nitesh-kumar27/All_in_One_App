package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Database_update extends AppCompatActivity {
    Button b1,b2;
    ProgressBar pb;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_update);
        b1=(Button) findViewById(R.id.button46);
        b2=(Button) findViewById(R.id.button47);
        pb=(ProgressBar) findViewById(R.id.progressBar2);
        e1=(EditText) findViewById(R.id.editTextTextPersonName9);
        e2=(EditText) findViewById(R.id.editTextTextPersonName10);
        e3=(EditText) findViewById(R.id.editTextTextPersonName11);
        firebaseDatabase= FirebaseDatabase.getInstance();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Database_update.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb.setVisibility(View.VISIBLE);
                databaseReference= firebaseDatabase.getReference("People");
                String name= e1.getText().toString();
                String email= e2.getText().toString();
                String phone= e3.getText().toString();
                if(phone.length()!=10){
                    e3.setError("Enter correct Phone no");
                }
                else{
                    Users user=new Users(name,email,phone);
                    databaseReference.child(phone).setValue(user);
                    Toast.makeText(Database_update.this, "Database Updated", Toast.LENGTH_SHORT).show();
                }
                pb.setVisibility(View.INVISIBLE);
            }
        });
    }
}