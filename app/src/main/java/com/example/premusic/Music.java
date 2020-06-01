package com.example.premusic;

public class Music {
    private int mImageRes;
    private String mMusicName;
    private String mArtistName;

    public Music(String music, String artist, int image){
        this.mMusicName=music;
        this.mArtistName=artist;
        this.mImageRes=image;
    }

    public String getMusicName(){
        return this.mMusicName;
    }

    public String getArtistName(){
        return this.mArtistName;
    }

    public int getImageRes(){
        return this.mImageRes;
    }
}
