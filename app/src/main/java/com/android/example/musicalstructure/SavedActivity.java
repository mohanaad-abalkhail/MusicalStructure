package com.android.example.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.android.example.musicalstructure.R.id.searchActivity;

public class SavedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        // Find the View that shows the search category
        TextView search = (TextView) findViewById(searchActivity);
        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the search View is clicked on.
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(SavedActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
