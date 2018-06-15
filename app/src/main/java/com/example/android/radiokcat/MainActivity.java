package com.example.android.radiokcat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the explore category
        TextView explore = (TextView) findViewById(R.id.explore_button);

        // Set a click listener on that View
        explore.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the explore View is clicked on.
            @Override
            public void onClick(View view) {
                Intent exploreIntent = new Intent(MainActivity.this, ExploreActivity.class);
                startActivity(exploreIntent);
            }
        });

    }

}
