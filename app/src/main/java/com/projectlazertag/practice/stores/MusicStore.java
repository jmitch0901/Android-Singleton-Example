package com.projectlazertag.practice.stores;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jmitc on 10/14/2016.
 */

public class MusicStore {

    private Context context;
    private static MusicStore store;


    private Map<String,Song> songList;

    private MusicStore(Context c) {
        this.context = c;
        songList = new HashMap<>();

        songList.put("Tok Tok",new Song("Tik Tok", "Ke$ha"));
        songList.put("Thriller",new Song("Thriller", "Michael Jackson"));

    }

    public static synchronized MusicStore get(Context c) {

        if (store == null) {
            store = new MusicStore(c);
        }

        return store;
    }

    public Song getSongByTitle(String name) {
        return this.songList.get(name);
    }

    public void addNewSong(Song s) {
        this.songList.put(s.getTitle(), s);
    }

    @Override
    public String toString() {
        return songList.toString();
    }
}
