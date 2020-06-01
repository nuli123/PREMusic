package com.example.premusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        ArrayList<Music> musicList = new ArrayList<Music>(){{
            add(new Music("7 Rings", Artists.ARIANA_GRANDE, R.drawable.ariana_grande));
            add(new Music("thank u, next", Artists.ARIANA_GRANDE, R.drawable.ariana_grande));
            add(new Music("Problem", Artists.ARIANA_GRANDE, R.drawable.ariana_grande));
            add(new Music("Bad Guy", Artists.BILLIE_EILISH, R.drawable.billie_eilish));
            add(new Music("Lovely", Artists.BILLIE_EILISH, R.drawable.billie_eilish));
            add(new Music("On", Artists.BTS, R.drawable.bts));
            add(new Music("Black Swan", Artists.BTS, R.drawable.bts));
            add(new Music("Everglow", Artists.COLDPLAY, R.drawable.coldplay));
            add(new Music("Hymn For The Weekend", Artists.COLDPLAY, R.drawable.coldplay));
            add(new Music("Yellow", Artists.COLDPLAY, R.drawable.coldplay));
            add(new Music("Flavor", Artists.KHALIL_FONG, R.drawable.khalil_fong));
            add(new Music("Run From Your Love", Artists.KHALIL_FONG, R.drawable.khalil_fong));
            add(new Music("Close To You", Artists.KHALIL_FONG, R.drawable.khalil_fong));
            add(new Music("Rain On Me", "Lady Gaga", R.drawable.lady_gaga));
            add(new Music("Applause", "Lady Gaga", R.drawable.lady_gaga));
            add(new Music("Shallow", "Lady Gaga", R.drawable.lady_gaga));
            add(new Music("Paris in the Rain", "Lauv", R.drawable.lauv));
            add(new Music("I Like Me Better", "Lauv", R.drawable.lauv));
            add(new Music("Blinding Lights", Artists.THE_WEEKEND, R.drawable.weekend));
            add(new Music("The Hills", Artists.THE_WEEKEND, R.drawable.weekend));
            add(new Music("Mulan", Artists.LEXIE_LIU, R.drawable.lexie_liu));
            add(new Music("Manta", Artists.LEXIE_LIU, R.drawable.lexie_liu));
        }};

        MusicAdapter musicAdapter = new MusicAdapter(this, musicList);
        ListView listView = findViewById(R.id.musicList);
        listView.setAdapter(musicAdapter);
    }
}
