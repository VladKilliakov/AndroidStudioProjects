package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class BarsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objects_list);

        // Create a list of words
        final ArrayList<Object> words = new ArrayList<Object>();

        words.add(new Object(getString(R.string.BarsItem1),
                getString(R.string.address) + getString(R.string.BarsItem1Address),
                getString(R.string.BarsItem1Description)));
        words.add(new Object(getString(R.string.BarsItem2),
                getString(R.string.address) + getString(R.string.BarsItem2Address),
                getString(R.string.BarsItem2Description)));
        words.add(new Object(getString(R.string.BarsItem3),
                getString(R.string.address) + getString(R.string.BarsItem3Address),
                getString(R.string.BarsItem3Description)));
        words.add(new Object(getString(R.string.BarsItem4),
                getString(R.string.address) + getString(R.string.BarsItem4Address),
                getString(R.string.BarsItem4Description)));
        words.add(new Object(getString(R.string.BarsItem5),
                getString(R.string.address) + getString(R.string.BarsItem5Address),
                getString(R.string.BarsItem5Description)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ObjectAdapter adapter = new ObjectAdapter(this, words, R.color.category_bars);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
