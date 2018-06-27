package com.example.android.radiokcat;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> phrases) {
        super(context, 0, phrases);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
//            le inflate - inflates a new listItemView called list_item (turns an XML file into actual view objects)
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getArtistSong());

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentSong.getTitleSong());

        TextView albumTextView = listItemView.findViewById(R.id.album_text_view);
        albumTextView.setText(currentSong.getAlbumSong());

        TextView yearTextView = listItemView.findViewById(R.id.year_text_view);
        yearTextView.setText(currentSong.getYearSong());

        return listItemView;

    }
}
