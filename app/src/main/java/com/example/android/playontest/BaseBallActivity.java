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

public class BaseBallActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("BaseBall Field 1", "address of BaseBall Field 1", R.drawable.baseball));
        places.add(new Place("BaseBall Field 2", "address of BaseBall Field 2", R.drawable.baseball));
        places.add(new Place("BaseBall Field 3", "address of BaseBall Field 3", R.drawable.baseball));
        places.add(new Place("BaseBall Field 4", "address of BaseBall Field 4", R.drawable.baseball));
        places.add(new Place("BaseBall Field 5", "address of BaseBall Field 5", R.drawable.baseball));
        places.add(new Place("BaseBall Field 6", "address of BaseBall Field 6", R.drawable.baseball));
        places.add(new Place("BaseBall Field 7", "address of BaseBall Field 7", R.drawable.baseball));


        PlaceAdapter adapter =
                new PlaceAdapter(this, places, R.color.category_baseball);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}