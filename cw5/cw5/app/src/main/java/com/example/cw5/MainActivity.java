package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText x=findViewById(R.id.name);
        final EditText e =findViewById(R.id.age);
        Button v=findViewById(R.id.nextPage);
        v.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String a= e.getText().toString();
                String s = x.getText().toString();
                Intent h=new Intent(MainActivity.this,MainActivity2.class);
                h.putExtra("info",s);
                h.putExtra("in",a);
                startActivity(h);



            }
        });































    }
}