package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.objects_list);

        // Create a list of words
        final ArrayList<Object> words = new ArrayList<Object>();

        words.add(new Object(getString(R.string.AttractionsItem1),
                getString(R.string.address) + getString(R.string.AttractionsItem1Address),
                R.drawable.attraction_item1, getString(R.string.AttractionsItem1Description)));
        words.add(new Object(getString(R.string.AttractionsItem2),
                getString(R.string.address) + getString(R.string.AttractionsItem2Address),
                R.drawable.attraction_item2, getString(R.string.AttractionsItem2Description)));
        words.add(new Object(getString(R.string.AttractionsItem3),
                getString(R.string.address) + getString(R.string.AttractionsItem3Address),
                R.drawable.attraction_item3, getString(R.string.AttractionsItem3Description)));
        words.add(new Object(getString(R.string.AttractionsItem4),
                getString(R.string.address) + getString(R.string.AttractionsItem4Address),
                R.drawable.attraction_item4, getString(R.string.AttractionsItem4Description)));
        words.add(new Object(getString(R.string.AttractionsItem5),
                getString(R.string.address) + getString(R.string.AttractionsItem5Address),
                R.drawable.attraction_item5, getString(R.string.AttractionsItem5Description)));
        words.add(new Object(getString(R.string.AttractionsItem6),
                getString(R.string.address) + getString(R.string.AttractionsItem6Address),
                R.drawable.attraction_item6, getString(R.string.AttractionsItem6Description)));
        words.add(new Object(getString(R.string.AttractionsItem7),
                getString(R.string.address) + getString(R.string.AttractionsItem7Address),
                R.drawable.attraction_item7, getString(R.string.AttractionsItem7Description)));
        words.add(new Object(getString(R.string.AttractionsItem8),
                getString(R.string.address) + getString(R.string.AttractionsItem8Address),
                R.drawable.attraction_item8, getString(R.string.AttractionsItem8Description)));
        words.add(new Object(getString(R.string.AttractionsItem9),
                getString(R.string.address) + getString(R.string.AttractionsItem9Address),
                R.drawable.attraction_item9, getString(R.string.AttractionsItem9Description)));
        words.add(new Object(getString(R.string.AttractionsItem10),
                getString(R.string.address) + getString(R.string.AttractionsItem10Address),
                R.drawable.attraction_item10, getString(R.string.AttractionsItem10Description)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        ObjectAdapter adapter = new ObjectAdapter(this, words, R.color.category_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }
}
