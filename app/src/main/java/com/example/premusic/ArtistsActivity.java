package com.example.premusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        // set onclick listener for each artist
        TextView lady_gaga = findViewById(R.id.lady_gaga);
        View.OnClickListener profileListener = new ActivityOnClickListener(ProfileActivity.class);
        lady_gaga.setOnClickListener(profileListener);
    }
}
