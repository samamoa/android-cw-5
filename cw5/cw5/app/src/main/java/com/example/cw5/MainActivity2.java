package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView g=findViewById(R.id.textView);
        TextView i=findViewById(R.id.textView3);
        Bundle airport =getIntent().getExtras();
        String mybag=airport.getString("info");
        String mybox=airport.getString("in");
        Button k=findViewById(R.id.button);
      g.setText(mybag);
      i.setText(mybox);
      i.getText().toString();
        k.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                Intent l = new Intent(MainActivity2.this, MainActivity.class);

                startActivity(l);
            }
        });
    }
    }
