package com.example.premusic;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ArtistAdapter extends ArrayAdapter {

    /***
     * This is customer constructer (doesn't mirror with any existing constructer of superclass)
     * This context is used to inflate the layout file, and the list is the data we want to populate into the list.
     * @param context
     * @param artists
     */
    public ArtistAdapter(Context context, List<Artist> artists){
        // Initialize the ArtistAdapter's nterna storage for the context and the list.
        // The second argument is used when ArrayAdapter is populating a single TextView.
        // Since this is a custom adapter for one ImageView and one TextView, the adapter
        // is not going to use the second argument in getView. So, it can be any value, e.g 0.
        super(context, 0, artists);
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
        View gridItemView=convertView;
        if(gridItemView==null){
            gridItemView= LayoutInflater.from(getContext()).inflate(R.layout.grid_artist, parent, false);
        }

        // Get the {@link Artist} object located at this position in the grid
        Artist currArtist = (Artist) getItem(position);
        // Find the ImageView in the grid_artist.xml with ID image
        ImageView image = gridItemView.findViewById(R.id.image);
        image.setImageResource(currArtist.getImageRes());
        // Find the TextView in the grid_artist.xml with ID artist
        TextView artist = gridItemView.findViewById(R.id.artist);
        artist.setText(currArtist.getArtistName());
        return gridItemView;
    }
}
