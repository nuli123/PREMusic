package com.example.premusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set artists onclick listener
        TextView artistsView = findViewById(R.id.artists_activity);
        View.OnClickListener artistsListener = new ActivityOnClickListener(ArtistsActivity.class);
        artistsView.setOnClickListener(artistsListener);

        // set music onclick listener
        TextView musicView = findViewById(R.id.music_activity);
        View.OnClickListener musicListener = new ActivityOnClickListener(MusicActivity.class);
        musicView.setOnClickListener(musicListener);
    }
}
