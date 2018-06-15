package com.example.android.radiokcat;

public class Song {

    private String mArtistSong;
    private String mTitleSong;
    private String mAlbumSong;
    private String mYearSong;

    /**
     * Create a new Song object.
     *
     * @param artistSong is Name of song Artist
     *
     * @param titleSong is Title of the song
     *
     * @param albumSong is Album the song is on

     * @param yearSong is the Year the song came out
     */
    public Song(String artistSong, String titleSong, String albumSong, String yearSong) {
        mArtistSong = artistSong;
        mTitleSong = titleSong;
        mAlbumSong = albumSong;
        mYearSong = yearSong;
    }

    /**
     * Get the default translation of the word.
     */
    public String getArtistSong() {
        return mArtistSong;
    }

    public String getTitleSong() {
        return mTitleSong;
    }

    public String getAlbumSong() {
        return mAlbumSong;
    }

    public String getYearSong() {
        return mYearSong;
    }

}
