package com.practical.schoolmanagement;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Infrastructure extends AppCompatActivity {

    Button transportBtn;
    Button feeBtn;
    Button libraryBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infrastructure);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        transportBtn=(Button)findViewById(R.id.button2);
        feeBtn=(Button)findViewById(R.id.button3);
        libraryBtn=(Button)findViewById(R.id.button4);

        transportBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Infrastructure.this,Transportation.class);
                startActivity(intent);
            }
        });

        feeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Infrastructure.this,Fee.class);
                startActivity(intent);
            }
        });
        libraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Infrastructure.this,Library.class);
                startActivity(intent);
            }
        });
    }
}
