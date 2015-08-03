package com.example.craig.myfirstapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Craig on 29/07/2015.
 */
public class MainListAdapter extends ArrayAdapter {
    public MainListAdapter(Context context, int resource,ArrayList<Bar> bars) {
        super(context, resource, bars);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
