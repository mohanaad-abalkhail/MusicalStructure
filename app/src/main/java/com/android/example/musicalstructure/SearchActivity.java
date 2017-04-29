package com.android.example.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.android.example.musicalstructure.R.id.browseActivity;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Find the View that shows the browse category
        TextView browse = (TextView) findViewById(browseActivity);
        // Set a click listener on that View
        browse.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the browse View is clicked on.
            @Override
            public void onClick(View view) {
                Intent browseIntent = new Intent(SearchActivity.this, BrowsActivity.class);
                startActivity(browseIntent);
            }
        });
    }
}
