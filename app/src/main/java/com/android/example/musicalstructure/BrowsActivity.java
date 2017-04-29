package com.android.example.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.android.example.musicalstructure.R.id.topChartsActivity;

public class BrowsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brows);

        // Find the View that shows the top charts category
        TextView topCharts = (TextView) findViewById(topChartsActivity);
        // Set a click listener on that View
        topCharts.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the top charts View is clicked on.
            @Override
            public void onClick(View view) {
                Intent topChartsIntent = new Intent(BrowsActivity.this, TopChartsActivity.class);
                startActivity(topChartsIntent);
            }
        });
    }
}
