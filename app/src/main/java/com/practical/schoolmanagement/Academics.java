package com.practical.schoolmanagement;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Academics extends AppCompatActivity {

    Button eventsBtn;
    Button academicsBtn;
    Button rulesBtn,scholarshipBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        academicsBtn=(Button)findViewById(R.id.button2);
        eventsBtn=(Button)findViewById(R.id.button1);
        rulesBtn=(Button)findViewById(R.id.button5);
        scholarshipBtn=(Button)findViewById(R.id.button3);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        eventsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Academics.this,Events.class);
                startActivity(intent);
            }
        });

        academicsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Academics.this,Scholarship.class);
               startActivity(intent);
            }
        });

        rulesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Academics.this,Rules.class);
                startActivity(intent);
            }
        });

        scholarshipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Academics.this,Scholarship.class);
                startActivity(intent);
            }
        });
    }
}
