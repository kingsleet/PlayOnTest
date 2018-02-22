package com.example.android.playontest;

/**
 * Created by Kingsley on 2/14/2018.
 */


import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SoccerActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Soccer Field 1", "address of Soccer Field 1", R.drawable.soccer));
        places.add(new Place("Soccer Field 2", "address of Soccer Field 2", R.drawable.soccer));
        places.add(new Place("Soccer Field 3", "address of Soccer Field 3", R.drawable.soccer));
        places.add(new Place("Soccer Field 4", "address of Soccer Field 4", R.drawable.soccer));
        places.add(new Place("Soccer Field 5", "address of Soccer Field 5", R.drawable.soccer));
        places.add(new Place("Soccer Field 6", "address of Soccer Field 6", R.drawable.soccer));
        places.add(new Place("Soccer Field 7", "address of Soccer Field 7", R.drawable.soccer));


        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_soccer);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}