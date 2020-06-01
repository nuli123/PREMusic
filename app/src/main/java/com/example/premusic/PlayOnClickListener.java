package com.example.premusic;

import android.content.Context;
import android.content.Intent;
import android.view.View;

public class PlayOnClickListener implements View.OnClickListener {
    private Class mClass;
    //private Context mContext;
    private Music mMusic;

    public PlayOnClickListener(Music music, Class _class){
        //this.mContext=context;
        this.mMusic=music;
        this.mClass = _class;
    }

    @Override
    public void onClick(View v) {
        Context context = v.getContext();
        Intent intent = new Intent(context,this.mClass);
        intent.putExtra("artistName", this.mMusic.getArtistName());
        intent.putExtra("songName", this.mMusic.getMusicName());
        intent.putExtra("artistImage", this.mMusic.getImageRes());
        context.startActivity(intent);
    }
}
