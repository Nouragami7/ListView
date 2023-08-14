package com.example.customerlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] cakeNames = {"Chocolate Cake", "Vanilla Cake", "Strawberry Cake", "Red Velvet Cake", "Carrot Cake", "Lemon Cake", "Coconut Cake"};
    String[] cakeDescriptions = {"A rich and decadent chocolate cake",
            "A classic vanilla cake with a light ",
            "A refreshing strawberry cake with " ,
            "A moist cake with a hint of cocoa ",
            "A spiced cake filled with grated",
            "A tangy and refreshing cake ",
            "A tropical cake with fluffy texture"};
    int[] cakesImages = {R.drawable.chococake,R.drawable.vanilla,R.drawable.strawberrycake,R.drawable.redvelvet,R.drawable.carrotcake,R.drawable.lemoncake,R.drawable.coco};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        ListAdapter adapter = new ListAdapter(this, cakeNames, cakeDescriptions,cakesImages);
        listView.setAdapter(adapter);
    }
}