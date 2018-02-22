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

public class BasketBallActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Basketball Court 1", "address of Basketball Court 1", R.drawable.basketball));
        places.add(new Place("Basketball Court 2", "address of Basketball Court 2", R.drawable.basketball));
        places.add(new Place("Basketball Court 3", "address of Basketball Court 3", R.drawable.basketball));
        places.add(new Place("Basketball Court 4", "address of Basketball Court 4", R.drawable.basketball));
        places.add(new Place("Basketball Court 5", "address of Basketball Court 5", R.drawable.basketball));
        places.add(new Place("Basketball Court 6", "address of Basketball Court 6", R.drawable.basketball));
        places.add(new Place("Basketball Court 7", "address of Basketball Court 7", R.drawable.basketball));


        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_basketball);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}