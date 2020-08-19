package com.practical.schoolmanagement;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class schoolTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_time);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}
