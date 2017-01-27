package com.example.admin.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Pearly on 2017-01-06.
 */
public class  WordAdapter extends ArrayAdapter<Word> {

    //resource ID for the background color for the list of words
    private  int mColorResourceId;


    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){
        //we initialize the ArrayAdapter's internal storage for the context and the list.
        //the second argument is used when the ArrayAdapter is populating a single TextView
        //Because this is a custom adapter for two TextViews and as ImageView, the adapter in not
        //going to use this second argument, so it can be any value. here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        //find the TextView in the list_item.xml layout with number in miwok languages
        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //find the TextView in the list_item.xml layout with number in default languages
        TextView defaultTextView = (TextView)listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //find the TextView in the list_item.xml layout with number in default languages
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //show the image if there is one or remove the placeholder as well
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResourceID());

            //make sure the image is visible if there is an image
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.word_container);

        //find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        //set the background color of the word container view
        textContainer.setBackgroundColor(color);

        //return the whole list item layout
        return listItemView;
    }
}

