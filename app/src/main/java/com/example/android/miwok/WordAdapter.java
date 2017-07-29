package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Shashikant on 7/28/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public int themeColorId;
   public WordAdapter(Activity context, ArrayList<Word> w, int colorId){
       super(context,0,w);
       themeColorId = colorId;
   }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }

        //get the current word

        Word currentWord = getItem(position);
        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.theme_linearlayout);
        linearLayout.setBackgroundResource(themeColorId);
        TextView defaultView = (TextView)listItemView.findViewById(R.id.default_translation_textview);
        defaultView.setText(currentWord.getDefaultTranslation());

        TextView miwokView = (TextView)listItemView.findViewById(R.id.miwok_translation_textview);
        miwokView.setText(currentWord.getMiwokTranslation());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.image_view);
        if(currentWord.hasAnImage()){
            imageView.setImageResource(currentWord.getImageId());
        }
        else{
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
