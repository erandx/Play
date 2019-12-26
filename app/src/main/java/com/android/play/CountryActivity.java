package com.android.play;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CountryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);
        // ListView Array adapter with Songs List Info.
        ArrayList<PlayList> PlayLists = new ArrayList<PlayList>();

        PlayLists.add(new PlayList("George Jones", "He Stopped Loving Her Today", R.drawable.country_cover));
        PlayLists.add(new PlayList("Johnny Cash", "Ring of Fire", R.drawable.country_cover));
        PlayLists.add(new PlayList("Alabama", "Song of the South", R.drawable.country_cover));
        PlayLists.add(new PlayList("Johnny Cash", "Hurt", R.drawable.country_cover));
        PlayLists.add(new PlayList("Johnny Cash", "I Walk The Line", R.drawable.country_cover));
        PlayLists.add(new PlayList("Johnny Cash", "Folsom Prison Blues", R.drawable.country_cover));
        PlayLists.add(new PlayList("Dolly Parton", "Jolene", R.drawable.country_cover));
        PlayLists.add(new PlayList("Kenny Rogers", "The Gambler", R.drawable.country_cover));
        PlayLists.add(new PlayList("Hank Williams", "I’ll Never Get Out Of This World Alive", R.drawable.country_cover));
        PlayLists.add(new PlayList("Merle Haggard", "Mama Tried", R.drawable.country_cover));



        // Create an {@link PlayListAdapter}, whose data source is a list of
        // {@link PlayList}s. The adapter knows how to create list item views for each item
        // in the list.
        PlayListAdapter listAdapter = new PlayListAdapter(this, PlayLists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listAdapter);
    }

}