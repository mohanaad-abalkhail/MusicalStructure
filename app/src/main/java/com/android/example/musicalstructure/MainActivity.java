package com.android.example.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.android.example.musicalstructure.R.id.browseActivity;
import static com.android.example.musicalstructure.R.id.favoritsActivity;
import static com.android.example.musicalstructure.R.id.nowPlayingActivity;
import static com.android.example.musicalstructure.R.id.savedActivity;
import static com.android.example.musicalstructure.R.id.searchActivity;
import static com.android.example.musicalstructure.R.id.topChartsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the browse category
        TextView browse = (TextView) findViewById(browseActivity);
        // Set a click listener on that View
        browse.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the browse View is clicked on.
            @Override
            public void onClick(View view) {
                Intent browseIntent = new Intent(MainActivity.this, BrowsActivity.class);
                startActivity(browseIntent);
            }
        });

        // Find the View that shows the top charts category
        TextView topCharts = (TextView) findViewById(topChartsActivity);
        // Set a click listener on that View
        topCharts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the top charts View is clicked on.
            @Override
            public void onClick(View view) {
                Intent topChartsIntent = new Intent(MainActivity.this, TopChartsActivity.class);
                startActivity(topChartsIntent);
            }
        });

        // Find the View that shows the favorites category
        TextView favorites = (TextView) findViewById(favoritsActivity);
        // Set a click listener on that View
        favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the favorites View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritsActivity.class);
                startActivity(favoritesIntent);
            }
        });

        // Find the View that shows the saved category
        TextView saved = (TextView) findViewById(savedActivity);
        // Set a click listener on that View
        saved.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the saved View is clicked on.
            @Override
            public void onClick(View view) {
                Intent savedIntent = new Intent(MainActivity.this, SavedActivity.class);
                startActivity(savedIntent);
            }
        });

        // Find the View that shows the search category
        TextView search = (TextView) findViewById(searchActivity);
        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        // Find the View that shows the now playing category
        TextView nowPlaying = (TextView) findViewById(nowPlayingActivity);
        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });
    }
}
