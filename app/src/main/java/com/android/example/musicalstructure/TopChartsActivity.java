package com.android.example.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.android.example.musicalstructure.R.id.favoritsActivity;

public class TopChartsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_charts);

        // Find the View that shows the favorites category
        TextView favorites = (TextView) findViewById(favoritsActivity);
        // Set a click listener on that View
        favorites.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the favorites View is clicked on.
            @Override
            public void onClick(View view) {
                Intent favoritesIntent = new Intent(TopChartsActivity.this, FavoritsActivity.class);
                startActivity(favoritesIntent);
            }
        });
    }
}
