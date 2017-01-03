package com.example.android.quakereport;

import android.app.Activity;
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
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by kilvl on 11/2/2016.
 */

public class EarthquakeAdapter extends ArrayAdapter<EarthquakeReport> {

    public EarthquakeAdapter(Activity context, ArrayList<EarthquakeReport> earthquakes){

        super(context,0,earthquakes);
}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        EarthquakeReport currentEarthquakeReport = getItem(position);

        // Find the TextView with magnitude
        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTextView.getBackground();

        // Get the appropriate background color based on the current earthquake magnitude
        int magnitude = (int) currentEarthquakeReport.getMagnitude();

        // Set the color on the magnitude circle
        int magnitudeColor = getMagnitudeColor(magnitude);

        magnitudeCircle.setColor(magnitudeColor);

        DecimalFormat formatter = new DecimalFormat("0.0");
        String outputMagnitude = formatter.format(currentEarthquakeReport.getMagnitude());
        magnitudeTextView.setText(String.valueOf(outputMagnitude));

        // Find the TextViews with the location details and set the proper text in them
        TextView locationOffsetTextView = (TextView) listItemView.findViewById(R.id.location_offset);
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_primary);

        String offsetLocation = StringSplitter(currentEarthquakeReport.getLocation())[0];
        String primaryLocation = StringSplitter(currentEarthquakeReport.getLocation())[1];

        locationOffsetTextView.setText(offsetLocation);
        locationTextView.setText(primaryLocation);

        // Find the TextViews with date and time
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        TextView timeView = (TextView) listItemView.findViewById(R.id.time);

        // Formatting the date
        Date dateObject = new Date(currentEarthquakeReport.getDate());
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");

        String dateToDisplay = dateFormat.format(dateObject);
        String timeToDisplay = timeFormat.format(dateObject);
        dateView.setText(dateToDisplay);
        timeView.setText(timeToDisplay);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView



        return listItemView;
    }


    private String[] StringSplitter(String location){
        if (location.contains(" of ")) {
            String[] newLocation = location.split("of");
            newLocation[0] = newLocation[0] + " of ";
            return newLocation;

        } else {
            String[] newLocation = {getContext().getString(R.string.near_the), location};
            return newLocation;
        }
    }

    private int getMagnitudeColor(int magnitude){
        int magnitudeColor;
        Log.v("reest", "magnitude" + magnitude);
        switch (magnitude) {
            case 0:
                magnitudeColor = R.color.magnitude1;
                break;
            case 1:
                magnitudeColor = R.color.magnitude1;
                break;
            case 2:
                magnitudeColor = R.color.magnitude2;
                break;
            case 3:
                magnitudeColor = R.color.magnitude3;
                break;
            case 4:
                magnitudeColor = R.color.magnitude4;
                break;
            case 5:
                magnitudeColor = R.color.magnitude5;
                break;
            case 6:
                magnitudeColor = R.color.magnitude6;
                break;
            case 7:
                magnitudeColor = R.color.magnitude7;
                break;
            case 8:
                magnitudeColor = R.color.magnitude8;
                break;
            case 9:
                magnitudeColor = R.color.magnitude9;
                break;
            case 10:
                magnitudeColor = R.color.magnitude10plus;
                break;
            default:
                magnitudeColor = R.color.magnitude1;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColor);
    }

}
