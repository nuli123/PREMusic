package com.example.premusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<Artist> artists = new ArrayList<Artist>(){{
            add(new Artist(Artists.ARIANA_GRANDE, R.drawable.ariana_grande));
            add(new Artist(Artists.BILLIE_EILISH, R.drawable.billie_eilish));
            add(new Artist(Artists.BTS, R.drawable.bts));
            add(new Artist(Artists.COLDPLAY, R.drawable.coldplay));
            add(new Artist(Artists.KHALIL_FONG, R.drawable.khalil_fong));
            add(new Artist(Artists.LADY_GAGA, R.drawable.lady_gaga));
            add(new Artist(Artists.LAUV, R.drawable.lauv));
            add(new Artist(Artists.LEXIE_LIU, R.drawable.lexie_liu));
            add(new Artist(Artists.THE_WEEKEND, R.drawable.weekend));
        }};

        GridView artistGrid = findViewById(R.id.artistGrid);
        ArtistAdapter artistAdapter = new ArtistAdapter(this, artists);
        artistGrid.setAdapter(artistAdapter);
    }
}
