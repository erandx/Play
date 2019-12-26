package com.android.play;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.play.PlayList;
import com.android.play.R;

import java.util.ArrayList;
import java.util.Set;

/*
 * {@link AndroidFlavorAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
 * based on a data source, which is a list of {@link AndroidFlavor} objects.
 * */
public class PlayListAdapter extends ArrayAdapter<PlayList> {

    public PlayListAdapter(Activity context, ArrayList<PlayList> Playlists) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Playlists);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.play_list, parent, false);
        }

        //get the object located at position
        final PlayList currentPlayList = getItem(position);

        //find the textview in play_list with id artist_text_view
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        //gets the default Translation and set it to the text of this textView
        artistTextView.setText(currentPlayList.getmArtistName());

        //find the textview in play_list with id song_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        //gets the miwok Translation and set it to the text of this textView
        miwokTextView.setText(currentPlayList.getmArtistSong());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.artist_cover);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentPlayList.getmImageResourceId());


        //Sets OnClick listener for the ListView
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent playing = new Intent(getContext(), Play.class);
                // Add the song name and artist name to the intent sent to Play

                playing.putExtra("Song", currentPlayList.getmArtistSong());
                playing.putExtra("Artist", currentPlayList.getmArtistName());
                playing.putExtra("Cover", currentPlayList.getmImageResourceId());
                getContext().startActivity(playing);


            }
        });

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
