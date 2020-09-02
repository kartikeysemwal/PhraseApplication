package com.example.phraseapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer1;
    MediaPlayer mediaPlayer2;
    MediaPlayer mediaPlayer3;
    MediaPlayer mediaPlayer4;
    MediaPlayer mediaPlayer5;
    MediaPlayer mediaPlayer6;
    MediaPlayer mediaPlayer7;
    MediaPlayer mediaPlayer8;

    public void speakEnglish(View view){
        mediaPlayer1.start();
    }
    public void goodEvening(View view){
        mediaPlayer2.start();
    }
    public void hello(View view){
        mediaPlayer3.start();
    }
    public void howAreYou(View view){
        mediaPlayer4.start();
    }
    public void ilivein(View view){
        mediaPlayer5.start();
    }
    public void myNameis(View view){
        mediaPlayer6.start();
    }
    public void please(View view){
        mediaPlayer7.start();
    }
    public void welcome(View view){
        mediaPlayer8.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer1 = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.goodevening);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.hello);
        mediaPlayer4 = MediaPlayer.create(this, R.raw.howareyou);
        mediaPlayer5 = MediaPlayer.create(this, R.raw.ilivein);
        mediaPlayer6 = MediaPlayer.create(this, R.raw.mynameis);
        mediaPlayer7 = MediaPlayer.create(this, R.raw.please);
        mediaPlayer8 = MediaPlayer.create(this, R.raw.welcome);
    }
}
