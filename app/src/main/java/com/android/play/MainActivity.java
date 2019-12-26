package com.android.play;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows Rock category
        TextView rock = (TextView) findViewById(R.id.rock);

        //Set a clickListener on that view
        rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Rock View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the{@link RockActivity}
                Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(rockIntent);
            }
        });

        //Find the view that shows Jazz category
        TextView jazz = (TextView) findViewById(R.id.jazz);

        //Set a clickListener on that view
        jazz.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Jazz View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new Intent to open the{@link JazzActivity}
                Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
                startActivity(jazzIntent);
            }
        });
        //Find the view that shows Country category
        TextView country = (TextView) findViewById(R.id.country);

        //Set a clickListener on that view
        country.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the Country View is clicked on.
            @Override
            public void onClick(View view){
                //Create a new Intent to open the{@link CountryActivity}
                Intent countryIntent = new Intent(MainActivity.this, CountryActivity.class);
                startActivity(countryIntent);
            }
        });
        //Find the view that shows Hip Hop category
        TextView hiphop = (TextView) findViewById(R.id.hiphop);

        //Set a clickListener on that view
        hiphop.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the Hip Hop View is clicked on.
            @Override
            public void onClick(View view){
                //Create a new Intent to open the{@link HipHopActivity}
                Intent hiphopIntent = new Intent(MainActivity.this, HipHopActivity.class);
                startActivity(hiphopIntent);
            }
        });
    }

}
