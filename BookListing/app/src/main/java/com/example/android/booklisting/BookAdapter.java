package com.example.android.booklisting;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.example.android.booklisting.R.id.authors;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each earthquake
 * in the data source (a list of {@link Book} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookAdapter extends ArrayAdapter<Book> {

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books   is the list of books, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays information about the book at the given position
     * in the list of books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = getItem(position);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentBook.getTitle());

        // Find the TextView with view ID authors
        TextView authorsView = (TextView) listItemView.findViewById(authors);
        authorsView.setSelected(true);

        List<String> authors = currentBook.getAuthors();
        String stringAuthors = "";

        if (currentBook.getAuthors().size() == 0) {
            stringAuthors = getContext().getString(R.string.no_authors);
        } else {
            for (int i = 0; i < authors.size(); i++) {
                if (i > 0) {
                    stringAuthors = stringAuthors + ", " + authors.get(i);
                } else {
                    stringAuthors = stringAuthors + authors.get(i);
                }
            }
        }
        authorsView.setText(stringAuthors);

        // Find the TextView with view ID location description
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description);
        // Display the description of the current book in that TextView
        if (currentBook.getDescription() == "" || currentBook.getDescription() == null) {
            descriptionView.setText(getContext().getString(R.string.no_description));
        } else {
            descriptionView.setText(currentBook.getDescription());
        }

        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}
