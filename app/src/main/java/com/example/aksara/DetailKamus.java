package com.example.aksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DetailKamus extends AppCompatActivity {

    private String selectedTopic = "";

    Button a,b,c,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kamus);

        a = findViewById(R.id.btnA);
        b = findViewById(R.id.btnB);
        c = findViewById(R.id.btnC);
        d = findViewById(R.id.btnD);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailKamus.this, HurufB.class));
            }
        });



    }

    public void btnTapped(View view){
//        int id = view.getId();
//        String ourId ="";

        startActivity(new Intent(DetailKamus.this, KamusActivity.class));
    }
}