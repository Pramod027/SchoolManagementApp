package com.practical.schoolmanagement;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StudentAttendance extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_attendance);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/spreadsheets/d/1eia0vu3Efoxqb3n8OnQbVICYBYtaDACPZ4Xh-QFEMys/edit#gid=186001220"));
     startActivity(intent);
    }
}

