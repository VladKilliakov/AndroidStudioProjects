package com.example.android.newsapp;


/**
 * An {@link Article} object contains information related to a single article.
 */
public class Article {

    /** Title of the article */
    private String mTitle;

    /** Author of the article */
    private String mAuthor;

    /** Section of the article */
    private String mSection;

    /** Publication date of the article */
    private String mPublicationDate;

    /** Website URL of the article */
    private String mUrl;


    public Article(String title, String author, String section, String publicationDate, String url) {
        mTitle = title;
        mAuthor = author;
        mSection = section;
        mPublicationDate = publicationDate;
        mUrl = url;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the list of authors of the article.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the description of the article.
     */
    public String getSection() {
        return mSection;
    }

    public String getPublicationDate() {
        return mPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
