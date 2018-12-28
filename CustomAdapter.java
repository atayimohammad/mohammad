package com.example.mohammdreza_cr7.tblbook;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {
    private Context mContext;
    private ArrayList<String> chapters;
    private ArrayList<String> sections;
    private DbHelper dbHelper;
    private ArrayList<Integer> stars;


    public CustomAdapter(Context mContext, int layout, ArrayList<String> chapters) {
        super(mContext, layout, chapters);
        this.chapters = chapters;
        this.mContext = mContext;
    }
    public CustomAdapter(Context mContext , int layout , ArrayList<String> chapters , ArrayList<String> sections ){
        super(mContext, layout, chapters);
        this.mContext = mContext;
        this.sections = sections;
        this.chapters = chapters;

    }
    public CustomAdapter(Context mContext , int layout , ArrayList<String> sections , ArrayList<Integer> stars ) {
        super(mContext, layout, sections);
        this.mContext = mContext;
        this.sections = sections;
        this.stars = stars;

    }
}
