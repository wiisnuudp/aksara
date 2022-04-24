package com.example.aksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PuzzleActivity2 extends AppCompatActivity {

    TextView textScreen, textQuestion, textTitle, textBtn;
    ImageView bigboss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle2);

        textQuestion = (TextView) findViewById(R.id.textQuestion);
        textScreen = (TextView) findViewById(R.id.textScreen);
        textTitle = (TextView) findViewById(R.id.textTitle);
        textBtn = (TextView) findViewById(R.id.textBtn);

        bigboss = (ImageView) findViewById(R.id.bigboss);
    }
    public void playAgain(View view){
        startActivity(new Intent(PuzzleActivity2.this, DetailGame.class));
    }
}