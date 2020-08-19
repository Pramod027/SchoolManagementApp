package com.practical.schoolmanagement;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class feature extends AppCompatActivity {

    ImageButton homeBtn;
    ImageButton contactBtn;
    ImageButton academicsBtn;
    ImageButton regBtn;
    ImageButton infrastBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        homeBtn=(ImageButton)findViewById(R.id.imageButton);
        contactBtn=(ImageButton) findViewById(R.id.imageButton6);
        academicsBtn=(ImageButton)findViewById(R.id.imageButton5);
        regBtn=(ImageButton)findViewById(R.id.imageButton4);
        infrastBtn=(ImageButton)findViewById(R.id.imageButton3);

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feature.this,student.class);
                startActivity(intent);
            }
        });
       contactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feature.this,Contact.class);
                startActivity(intent);
            }
        });

        academicsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feature.this,Academics.class);
                startActivity(intent);
            }
        });

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feature.this,Registration.class);
                startActivity(intent);
            }
        });
        infrastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(feature.this,Infrastructure.class);
                startActivity(intent);
            }
        });
    }
}
