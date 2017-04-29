package com.android.example.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.android.example.musicalstructure.R.id.favoritsActivity;
import static com.android.example.musicalstructure.R.id.nowPlayingActivity;

public class FavoritsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorits);

        // Find the View that shows the now playing category
        TextView nowPlaying = (TextView) findViewById(nowPlayingActivity);
        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(FavoritsActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

    }
}
