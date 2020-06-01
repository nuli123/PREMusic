package com.example.premusic;

public class Artist {
    private int mImageRes;
    private String mArtistName;

    public Artist(String artist, int image){
        this.mArtistName=artist;
        this.mImageRes=image;
    }

    public String getArtistName(){
        return this.mArtistName;
    }

    public int getImageRes(){
        return this.mImageRes;
    }
}
