package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

    public class EarthquakeLoader extends AsyncTaskLoader<List<EarthquakeReport>> {

        private static final String LOG_TAG = EarthquakeLoader.class.getName();
        private String mUrl;

        public EarthquakeLoader(Context context, String url) {
            super(context);
            mUrl = url;
        }

        @Override
        protected void onStartLoading() {
            Log.v(LOG_TAG, "onStartLoading");
            forceLoad();
        }

        @Override
        public List<EarthquakeReport> loadInBackground() {
            Log.v(LOG_TAG, "loadInBackground");
            // Don't perform the request if there are no URLs, or the first URL is null.
            if (mUrl == null) {
                return null;
            }

            List<EarthquakeReport> result = QueryUtils.fetchEarthquakeData(mUrl);
            return result;
        }
    }
