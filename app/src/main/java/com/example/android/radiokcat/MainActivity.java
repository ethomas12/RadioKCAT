package com.example.android.radiokcat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Landing page button to Listen Activity
        Button listenButton = findViewById(R.id.main_listen_button);
        listenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent listenIntent = new Intent(MainActivity.this, ListenActivity.class);
                startActivity(listenIntent);
            }
        });

        //Landing page button to Explore Activity
        Button mainExploreButton = findViewById(R.id.main_explore_button);
        mainExploreButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent exploreIntent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(exploreIntent);
            }
        });
    }
}
