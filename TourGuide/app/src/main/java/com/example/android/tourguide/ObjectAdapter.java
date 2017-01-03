/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

import android.content.Context;
import android.content.Intent;
import android.opengl.Visibility;
import android.support.v4.content.ContextCompat;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

/**
 * {@link ObjectAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Object} objects.
 */
public class ObjectAdapter extends ArrayAdapter<Object> {

    /**
     * Create a new {@link ObjectAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Object}s to be displayed.
     */
    private int mColorResourceId;

    public ObjectAdapter(Context context, ArrayList<Object> objects, int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Object} object located at this position in the list
        final Object currentObject = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView objectNameTV = (TextView) listItemView.findViewById(R.id.name_text_view);
        objectNameTV.setSelected(true);
        objectNameTV.setText(currentObject.getObjectName());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTV = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTV.setSelected(true);
        addressTV.setText(currentObject.getObjectAddress());

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView objectDescription = (TextView) listItemView.findViewById(R.id.description_text_view);
        objectDescription.setText(currentObject.getObjectDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        final ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentObject.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentObject.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        textContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentObject.hasImage()) {
                    if (imageView.getVisibility() == View.GONE) {
                        imageView.setVisibility(View.VISIBLE);
                    } else {
                        imageView.setVisibility(View.GONE);
                    }
                }
            }
        });


        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}