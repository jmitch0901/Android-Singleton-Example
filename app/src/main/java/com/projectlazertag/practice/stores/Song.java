package com.projectlazertag.practice.stores;

/**
 * Created by jmitc on 10/14/2016.
 */

public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return title = ": by " + artist;
    }
}
