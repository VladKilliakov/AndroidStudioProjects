package com.example.android.booklisting;

import java.util.List;

/**
 * An {@link Book} object contains information related to a single book.
 */
public class Book {

    /** Title of the book */
    private String mTitle;

    /** List of authors of the book */
    private List<String> mAuthors;

    /** Description of the book */
    private String mDescription;

    /** Website URL of the book */
    private String mUrl;


    public Book(String title, List<String> authors, String description, String url) {
        mTitle = title;
        mAuthors = authors;
        mDescription = description;
        mUrl = url;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the list of authors of the book.
     */
    public List<String> getAuthors() {
        return mAuthors;
    }

    /**
     * Returns the description of the book.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Returns the website URL to find more information about the book.
     */
    public String getUrl() {
        return mUrl;
    }
}
