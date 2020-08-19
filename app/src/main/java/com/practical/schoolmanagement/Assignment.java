package com.practical.schoolmanagement;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Assignment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1eE4TodRyqH4B7qi2KozsBmkYUXDE704EeyUaDhfuR3c/edit#gid=891834841"));
        startActivity(intent);
    }
}
