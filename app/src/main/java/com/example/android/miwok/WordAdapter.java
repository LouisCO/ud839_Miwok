package com.example.android.miwok;


import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    //Resource id for the background color
    private int mColorResourceId;


    /**
     * This is custom constructor
     *
     * @param context         Current context
     * @param words           List of Word Objects
     * @param colorResourceId is the resource id for the activities backgrounds
     */
    WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId=colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView=convertView;
        if (listItemView == null) {
            listItemView=LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord=getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView=listItemView.findViewById(R.id.miwokWord);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        if (currentWord != null) {
            miwokTextView.setText(currentWord.getMiwokTranslation());
        }

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView=listItemView.findViewById(R.id.englishWord);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        if (currentWord != null) {
            defaultTextView.setText(currentWord.getDefaultTranslation());
        }

        // Find the ImageView in the list_item.xml layout with the ID version_number
        ImageView imageView=listItemView.findViewById(R.id.item_img);
        // Check if image is provided
        if (currentWord != null) {
            if (currentWord.hasImage()) {
                // If any available, display
                imageView.setImageResource(currentWord.getImageResourceId());
                // Make sure it is visible
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }
        }
        View textContainer=listItemView.findViewById(R.id.text_container);
        int color=ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
