package com.example.premusic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MusicAdapter extends ArrayAdapter {
    /***
     * This is customer constructer (doesn't mirror with any existing constructer of superclass)
     * This context is used to inflate the layout file, and the list is the data we want to populate into the list.
     * @param context
     * @param musicList
     */
    public MusicAdapter(Context context, List<Music> musicList){
        // Initialize the ArtistAdapter's internal storage for the context and the list.
        // The second argument is used when ArrayAdapter is populating a single TextView.
        // Since this is a custom adapter for one ImageView and two TextView, the adapter
        // is not going to use the second argument in getView. So, it can be any value, e.g 0.
        super(context, 0, musicList);
    }

    /***
     * Provides the view for AdapterView, e.g ListView, GridView etc.
     * @param position: The position in the list of data that should be displayed in the list item view
     * @param convertView: The recycled view to populate
     * @param parent: The parent ViewGroup that is used to inflation
     * @return: THe view for ths position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_music, parent, false);
        }

        // Get the {@link Music} object located at this position in the list
        Music currMusic = (Music) getItem(position);
        // Find the ImageView in the list_music.xml layout with ID image
        ImageView image = listItemView.findViewById(R.id.image);
        image.setImageResource(currMusic.getImageRes());
        // Find the TextView in the list_music.xml layout with ID music
        TextView music = listItemView.findViewById(R.id.music);
        music.setText(currMusic.getMusicName());
        // Find the TextView in the list_music.xml layout with ID artist
        TextView artist = listItemView.findViewById(R.id.artist);
        artist.setText(currMusic.getArtistName());
        return listItemView;
    }
}
