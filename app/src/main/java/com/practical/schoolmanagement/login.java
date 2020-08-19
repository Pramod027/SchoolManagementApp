package com.practical.schoolmanagement;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText user,pass;
    Button log_in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        user=(EditText)findViewById(R.id.editText);
        pass=(EditText)findViewById(R.id.editText2);
        log_in=(Button)findViewById(R.id.button);



    }
    public void logged_in(String username,String password){
        if(username.equals("school")&&password.equals("school")) {
            Intent intent=new Intent(login.this,feature.class);
            startActivity(intent);
        }
            else{
                Toast.makeText(this,"Login Unsuccessful",Toast.LENGTH_LONG).show();
            }

    }

    public void login(View view) {
        String uname=user.getText().toString();
        String passw=pass.getText().toString();
        logged_in(uname,passw);
    }
}
