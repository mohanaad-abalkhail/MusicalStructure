package com.android.example.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.android.example.musicalstructure.R.id.savedActivity;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Find the View that shows the saved category
        TextView saved = (TextView) findViewById(savedActivity);
        // Set a click listener on that View
        saved.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the saved View is clicked on.
            @Override
            public void onClick(View view) {
                Intent savedIntent = new Intent(NowPlayingActivity.this, SavedActivity.class);
                startActivity(savedIntent);
            }
        });
    }
}
