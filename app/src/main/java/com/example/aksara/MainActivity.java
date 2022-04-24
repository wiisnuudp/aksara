package com.example.aksara;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Dialog mDialog;
    ImageView playBtn,closeBtn;
//    MediaController controller;

    private String selectedTopic = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.avicii;

        mDialog = new Dialog(MainActivity.this);
        mDialog.setContentView(R.layout.tutorvid);
        playBtn = mDialog.findViewById(R.id.play);
        closeBtn = mDialog.findViewById(R.id.close);
        VideoView videoView = mDialog.findViewById(R.id.video_view);

//        mDialog.show();
//
//        Uri uri = Uri.parse(videoPath);
//        videoView.setVideoURI(uri);
//        MediaController mediaController = new MediaController(MainActivity.this);
//        videoView.setMediaController(mediaController);
//        mediaController.setAnchorView(videoView);
//        videoView.start();
//
//        closeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mDialog.dismiss();
//            }
//        });
//
//        playBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (!videoView.isPlaying()){
//                    videoView.start();
//                    playBtn.setImageResource(R.drawable.ic_pause);
//                }
//                else {
//                    videoView.pause();
//                    playBtn.setImageResource(R.drawable.ic_play);
//                }
//            }
//        });



        final CardView jawa = findViewById(R.id.jawaLayout);
        final CardView sunda = findViewById(R.id.sundaLayout);
        final CardView bali = findViewById(R.id.baliLayout);
        final CardView batak = findViewById(R.id.batakLayout);
        final Button startBtn = findViewById(R.id.startQuizbtn);



        jawa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Aksara Jawa";

                jawa.setBackgroundResource(R.drawable.round_back_white_stroke);
                sunda.setBackgroundResource(R.drawable.round_back_and_white);
                bali.setBackgroundResource(R.drawable.round_back_and_white);
                batak.setBackgroundResource(R.drawable.round_back_and_white);
            }
        });

        sunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Aksara Sunda";

                sunda.setBackgroundResource(R.drawable.round_back_white_stroke);
                bali.setBackgroundResource(R.drawable.round_back_and_white);
                jawa.setBackgroundResource(R.drawable.round_back_and_white);
                batak.setBackgroundResource(R.drawable.round_back_and_white);
            }
        });

        bali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Aksara Bali";

                bali.setBackgroundResource(R.drawable.round_back_white_stroke);
                jawa.setBackgroundResource(R.drawable.round_back_and_white);
                sunda.setBackgroundResource(R.drawable.round_back_and_white);
                batak.setBackgroundResource(R.drawable.round_back_and_white);


            }
        });

        batak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopic = "Aksara Batak";

                batak.setBackgroundResource(R.drawable.round_back_white_stroke);
                jawa.setBackgroundResource(R.drawable.round_back_and_white);
                sunda.setBackgroundResource(R.drawable.round_back_and_white);
                bali.setBackgroundResource(R.drawable.round_back_and_white);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedTopic.isEmpty()){
                    Toast.makeText(MainActivity.this, "Please select topic", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, DetailAksara.class);
                    intent.putExtra("selectedTopic", selectedTopic);
                    startActivity(intent);
                }
            }
        });
    }
}