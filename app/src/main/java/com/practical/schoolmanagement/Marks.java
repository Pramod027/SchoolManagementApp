package com.practical.schoolmanagement;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1uiEgcFzh4ns3NXllBVZCLtSWhoJJJ4vgv7lHZQwZsW0/edit#gid=0"));
        startActivity(intent);
    }
}
