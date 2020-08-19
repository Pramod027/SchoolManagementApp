package com.practical.schoolmanagement;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ViewFlipper;

public class Library extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
       // TextView textView = new TextView(this);
        //textView.setText("Dynamically added TextView");
        //textView.setGravity(Gravity.CENTER);

       // viewFlipper.addView(textView);
        viewFlipper = findViewById(R.id.view_flipper);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();
    }
}
