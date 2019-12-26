package com.android.play;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Set;

import static com.android.play.R.drawable.ic_next;
import static com.android.play.R.drawable.ic_play;
import static com.android.play.R.drawable.ic_previous;

public class Play extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play);

        // Get the intent that was used to start this activity
        Intent playing = getIntent();

        // Find the views on the play.xml
        TextView playingSongTextView = findViewById(R.id.song_text_view);
        TextView playingArtistTextView = findViewById(R.id.artist_text_view);
        ImageView playingCoverImageView = findViewById(R.id.artist_cover);

        //Sets the views from the intent
        playingSongTextView.setText(playing.getStringExtra("Song"));
        playingArtistTextView.setText(playing.getStringExtra("Artist"));
        playingCoverImageView.setImageResource(playing.getIntExtra("Cover", 0));


        //Music Player Buttons
        final ImageView buttonPlay = findViewById(R.id.button_play);
        final ImageView buttonNext = findViewById(R.id.button_next);
        final ImageView buttonPrevious = findViewById(R.id.button_previous);

        //Play and Pause Buttons
        buttonPlay.setTag(0);
        buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (buttonPlay.getTag().equals(0)) {
                    buttonPlay.setImageResource(R.drawable.ic_pause);
                    buttonPlay.setTag(1);

                } else {
                    buttonPlay.setImageResource(ic_play);
                    buttonPlay.setTag(0);

                }
            } });

        //Play and Pause Buttons
        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(Play.this, HipHopActivity.class);
                startActivity(playerIntent);
            }
        });
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(Play.this, JazzActivity.class);
                startActivity(playerIntent);
            }
        });

    }
}