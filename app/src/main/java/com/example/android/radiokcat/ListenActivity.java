package com.example.android.radiokcat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class ListenActivity extends AppCompatActivity {
//
//    String mArtistView;
//    String mTitleView;
//    String mAlbumView;
//    String mYearView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listen_item);

        //Listen page button to Landing page
        Button homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listenExploreIntent = new Intent(ListenActivity.this, MainActivity.class);
                startActivity(listenExploreIntent);
            }
        });

        //Listen page button to Explore page
        Button exploreButton = findViewById(R.id.explore_button);
        exploreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exploreIntent = new Intent(ListenActivity.this, ExploreActivity.class);
                startActivity(exploreIntent);
            }
        });

        //Listen activity play button
        ImageView listenPlayButton = findViewById(R.id.listen_play_button);
        //Set a boolean for the ImageView playbutton, default is not playing
        listenPlayButton.setImageDrawable(getResources().getDrawable(R.drawable.whiteplaybutton));
        final boolean[] isPlaying = {false};

        listenPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying[0]) {

                    Toast toast1 = Toast.makeText(ListenActivity.this, "The track is paused", Toast.LENGTH_SHORT);
                    toast1.show();
                    isPlaying[0] = false;

                } else {
                    Toast toast1 = Toast.makeText(ListenActivity.this, "The track is playing", Toast.LENGTH_SHORT);
                    toast1.show();
                    isPlaying[0] = true;
                }
            }
        });
    }
}