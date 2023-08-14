package com.example.customerlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<String> {

    Context context;
    String[] cakeNames;
    String[] cakeDescriptions;
    int[] cakeImages;

    public ListAdapter(Context context, String[] cakeNames, String[] cakeDescriptions, int[] cakeImages) {
        super(context, R.layout.list_items, cakeNames);
        this.context = context;
        this.cakeNames = cakeNames;
        this.cakeDescriptions = cakeDescriptions;
        this.cakeImages = cakeImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.list_items, parent, false);

        TextView nameTextView = convertView.findViewById(R.id.cake_name);
        TextView descriptionTextView = convertView.findViewById(R.id.cake_description);
        ImageView imageView = convertView.findViewById(R.id.cake_image);

        nameTextView.setText(cakeNames[position]);
        descriptionTextView.setText(cakeDescriptions[position]);
        imageView.setImageResource(cakeImages[position]);

        return convertView;
    }
}