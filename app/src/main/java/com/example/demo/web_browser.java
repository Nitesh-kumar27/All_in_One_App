package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class web_browser extends AppCompatActivity {
    EditText e1;
    Button b1,b2;
    WebView w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);
        e1=(EditText) findViewById(R.id.editTextTextPersonName8);
        b1=(Button) findViewById(R.id.button26);
        b2=(Button) findViewById(R.id.button27);
        w=(WebView) findViewById(R.id.web);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s= e1.getText().toString();
                w.loadUrl(s);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(web_browser.this, MyMenu.class);
                startActivity(i);
                finish();
            }
        });
    }
}