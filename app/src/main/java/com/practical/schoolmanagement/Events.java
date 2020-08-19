package com.practical.schoolmanagement;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class Events extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        viewFlipper = findViewById(R.id.view_flipper);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();
    }
}
