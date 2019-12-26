package com.android.play;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artists_list);
        // ListView Array adapter with Songs List Info.
        ArrayList<PlayList> PlayLists = new ArrayList<PlayList>();

        PlayLists.add(new PlayList("Miles Davis", "So What", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Frank Sinatra", "Fly Me To The Moon", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Duke Ellington & His Famous Orchestra", "Mood Indigo", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Stan Getz & Joao Gilberto", "The Girl From Ipanema", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Cab Calloway", "Minnie The Moocher", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Louis Armstrong", "What A Wonderful World", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Billie Holiday", "Strange Fruit", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Ray Charles", "Georgia On My Mind", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Nina Simone", "My Baby Just Cares For Me", R.drawable.jazz_cover));
        PlayLists.add(new PlayList("Ella Fitzgerald & Louis Armstrong", "Summertime", R.drawable.jazz_cover));


        // Create an {@link PlayListAdapter}, whose data source is a list of
        // {@link PlayList}s. The adapter knows how to create list item views for each item
        // in the list.
        PlayListAdapter listAdapter = new PlayListAdapter(this, PlayLists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listAdapter);
    }
}
