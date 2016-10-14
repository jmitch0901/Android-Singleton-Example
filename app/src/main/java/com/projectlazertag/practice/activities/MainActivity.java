package com.projectlazertag.practice.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.projectlazertag.practice.R;
import com.projectlazertag.practice.stores.MusicStore;

/**
 * Created by jmitc on 10/14/2016.
 */

public class MainActivity extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.main_activity);

        Button b = (Button) this.findViewById(R.id.button);
        t = (TextView) findViewById(R.id.newId);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        MusicStore.get(this).getSongByTitle("Tik Tok");
        t.setText(MusicStore.get(this).toString());




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        t.setText(MusicStore.get(this).toString());

    }
}
