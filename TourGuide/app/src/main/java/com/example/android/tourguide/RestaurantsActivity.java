package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objects_list);

        // Create a list of words
        final ArrayList<Object> words = new ArrayList<Object>();

        words.add(new Object(getString(R.string.RestaurantsItem1),
                getString(R.string.address) + getString(R.string.RestaurantsItem1Address),
                getString(R.string.RestaurantsItem1Description)));
        words.add(new Object(getString(R.string.RestaurantsItem2),
                getString(R.string.address) + getString(R.string.RestaurantsItem2Address),
                getString(R.string.RestaurantsItem2Description)));
        words.add(new Object(getString(R.string.RestaurantsItem3),
                getString(R.string.address) + getString(R.string.RestaurantsItem3Address),
                getString(R.string.RestaurantsItem3Description)));
        words.add(new Object(getString(R.string.RestaurantsItem4),
                getString(R.string.address) + getString(R.string.RestaurantsItem4Address),
                getString(R.string.RestaurantsItem4Description)));
        words.add(new Object(getString(R.string.RestaurantsItem5),
                getString(R.string.address) + getString(R.string.RestaurantsItem5Address),
                getString(R.string.RestaurantsItem5Description)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ObjectAdapter adapter = new ObjectAdapter(this, words, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }}
