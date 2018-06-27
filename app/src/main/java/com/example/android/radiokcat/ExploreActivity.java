package com.example.android.radiokcat;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ExploreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Blackbear", "Wish You the Best", "Digital Druglord", "2017"));
        songs.add(new Song("Clams Casino", "I Am God", "Instrumentals 2", "2012"));
        songs.add(new Song("Kadhja Bonet", "Another Time Lover", "Childqueen", "2018"));
        songs.add(new Song("Kim Wilde", "Kids In America", "Kim Wilde", "1981"));
        songs.add(new Song("Tribe Called Quest", "We the People", "We Got It From Here Thank You 4 Your Service", "2016"));
        songs.add(new Song("The Glitch Mob", "Come Closer", "See Without Eyes", "2018"));
        songs.add(new Song("Mac DeMarco", "My Kind of Woman", "2", "2012"));
        songs.add(new Song("Cake", "Sheep Go To Heaven", "Prolonging the Magic", "1998"));
        songs.add(new Song("Washed Out", "All I Know", "Paracosm", "2013"));
        songs.add(new Song("Run the Jewels", "Legend Has It", "RTJ & Black Panther", "2017"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}