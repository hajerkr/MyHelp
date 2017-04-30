package com.example.hajer.myhelp;

import android.support.v7.app.AppCompatActivity;
import android.os.*;
import android.util.*;
import android.widget.*;
import android.media.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton btn1 = (ImageButton) this.findViewById(R.id.imageButton);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.hungry);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        ImageButton btnD = (ImageButton) this.findViewById(R.id.imageButtonDrink);
        final MediaPlayer mpD = MediaPlayer.create(this, R.raw.thirsty);
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mpD.start();
            }
        });
        ImageButton btn2 = (ImageButton) this.findViewById(R.id.imageButton2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.sleepy);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        ImageButton btn3 = (ImageButton) this.findViewById(R.id.imageButton3);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.cold);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        ImageButton btn4 = (ImageButton) this.findViewById(R.id.imageButton4);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.hot);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });
        ImageButton btn5 = (ImageButton) this.findViewById(R.id.imageButton5);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.bored);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });
        ImageButton btn6 = (ImageButton) this.findViewById(R.id.imageButton6);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.shower);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });
        ImageButton btn7 = (ImageButton) this.findViewById(R.id.imageButton7);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.toilet);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
            }
        });
        ImageButton btn8 = (ImageButton) this.findViewById(R.id.imageButton8);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.inside);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
            }
        });
        ImageButton btn9 = (ImageButton) this.findViewById(R.id.imageButton9);
        final MediaPlayer mp9 = MediaPlayer.create(this, R.raw.outside);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp9.start();
            }
        });
    }
}