package com.example.premusic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        TextView artistText = findViewById(R.id.artistName);
        TextView songText = findViewById(R.id.songName);
        ImageView artistImage = findViewById(R.id.artistImage);
        Bundle bundle = getIntent().getExtras();
        if(bundle.getString("artistName")!=null){
            artistText.setText(bundle.getString("artistName"));
        }
        if(bundle.getString("songName")!=null){
            songText.setText(bundle.getString("songName"));
        }
        if(bundle.getInt("artistImage")!=0){
            artistImage.setImageResource(bundle.getInt("artistImage"));
        }
    }
}
