package com.example.aksara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailAksara extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.aksara.EXTRA_TEXT";

    Button btnQuiz;
    String topic;
    TextView textTopic;
    String getSelectedTopic="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_aksara);

        String getSelectedTopic = getIntent().getStringExtra("selectedTopic");
        textTopic = findViewById(R.id.txtJudul);

        topic = textTopic.getText().toString();

        textTopic.setText(getSelectedTopic);
    }
    public void gameClick(View view){
        startActivity(new Intent(DetailAksara.this, DetailGame.class));
    }
    public void QuizClick(View view){

        Intent intent = new Intent(DetailAksara.this, QuizActivity.class);
        intent.putExtra("selectedTopic", getSelectedTopic);
        startActivity(intent);
    }
}