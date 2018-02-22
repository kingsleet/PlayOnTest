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

public class TennisActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Tennis Court 1", "address of Tennis Court 1", R.drawable.tennis));
        places.add(new Place("Tennis Court 2", "address of Tennis Court 2", R.drawable.tennis));
        places.add(new Place("Tennis Court 3", "address of Tennis Court 3", R.drawable.tennis));
        places.add(new Place("Tennis Court 4", "address of Tennis Court 4", R.drawable.tennis));
        places.add(new Place("Tennis Court 5", "address of Tennis Court 5", R.drawable.tennis));
        places.add(new Place("Tennis Court 6", "address of Tennis Court 6", R.drawable.tennis));
        places.add(new Place("Tennis Court 7", "address of Tennis Court 7", R.drawable.tennis));


        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_tennis);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}