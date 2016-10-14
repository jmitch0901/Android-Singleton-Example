package com.projectlazertag.practice.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.projectlazertag.practice.R;
import com.projectlazertag.practice.stores.MusicStore;
import com.projectlazertag.practice.stores.Song;

/**
 * Created by jmitc on 10/14/2016.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        TextView t = (TextView) findViewById(R.id.textView);

        MusicStore store = MusicStore.get(this);

        store.addNewSong(new Song("All Night Longer", "Sammy Adams"));


        t.setText(store.toString());
    }
}
