package com.practical.schoolmanagement;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Contact extends AppCompatActivity {

    TextView schoolInfo;
    TextView gpdBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        gpdBtn=(TextView)findViewById(R.id.textView7);
       schoolInfo=(TextView)findViewById(R.id.textView9);
        schoolInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://kws.edu.np"));
                startActivity(intent);

            }
        });
        gpdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Contact.this,Location.class);
                startActivity(intent1);
            }
        });

    }
}
