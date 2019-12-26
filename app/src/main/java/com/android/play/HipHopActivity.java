package com.android.play;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);
        // ListView Array adapter with Songs List Info.
        ArrayList<PlayList> PlayLists = new ArrayList<PlayList>();

        PlayLists.add(new PlayList("2Pac", "Keep Ya Head Up", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("Dr. Dre, Snoop Dogg", "Nuthin' But a G Thang", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("2Pac", "Dear Mama", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("Eminem, Dr. Dre", "Forgot About Dre", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("The Notorious B.I.G.", "Big Poppa", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("2Pac", "Changes", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("Eminem, Dido", "Stan", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("50 Cent", "In da Club", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("Eminem", "The Real Slim Shady", R.drawable.hiphop_cover));
        PlayLists.add(new PlayList("Coolio", "Gangsta's Paradise", R.drawable.hiphop_cover));




        // Create an {@link PlayListAdapter}, whose data source is a list of
        // {@link PlayList}s. The adapter knows how to create list item views for each item
        // in the list.
        PlayListAdapter listAdapter = new PlayListAdapter(this, PlayLists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listAdapter);


    }


}
