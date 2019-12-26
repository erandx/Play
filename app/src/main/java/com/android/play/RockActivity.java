package com.android.play;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);
        // ListView Array adapter with Songs List Info.
        ArrayList<PlayList> PlayLists = new ArrayList<PlayList>();

        PlayLists.add(new PlayList("Bon Jovi", "It's My Life", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Red Hot Chili Pappers", "Californication", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Linkin Park", "Numb", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Metallica", "Nothing else Matters", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Nirvana", "Smells Like Teen Spirit", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Europe", "The Final Countdown", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Guns N' Roses", "November Rain", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Audioslave", "Like a Stone", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Queen", "I Want To Break Free", R.drawable.rock_cover));
        PlayLists.add(new PlayList("Aerosmith", "I Don't Want to Miss a Thing", R.drawable.rock_cover));


        // Create an {@link PlayListAdapter}, whose data source is a list of
        // {@link PlayList}s. The adapter knows how to create list item views for each item
        // in the list.
        PlayListAdapter listAdapter = new PlayListAdapter(this, PlayLists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listAdapter);
    }
}
