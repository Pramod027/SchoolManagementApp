package com.practical.schoolmanagement;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class student extends AppCompatActivity {

    Button stuDetail;
    Button stuMarks;
    Button stuAssign;
    Button stuDate;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);


        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        myDb = new DatabaseHelper(this);

        stuDetail = (Button) findViewById(R.id.button);
        stuMarks = (Button) findViewById(R.id.button4);
        stuAssign = (Button) findViewById(R.id.button3);
        stuDate=(Button)findViewById(R.id.button2);
        stuDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(student.this, StudentDetails.class);
                startActivity(intent);
            }
        });

        viewAll();
        stuAssign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(student.this,Assignment.class);
                startActivity(intent);
            }
        });
        stuDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(student.this,StudentAttendance.class);
                startActivity(intent);
            }
        });
        stuMarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(student.this,Marks.class);
                startActivity(intent);
            }
        });
    }

    public void viewAll() {
        stuMarks.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();//because return value of cursor
                        //no item in database (view using Ctrl+mouse)
                        if (res.getCount() == 0) {
                            showMessage("error", "No data found");
                            return; //return current cursor position
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :" + res.getString(0) + "\n");
                            buffer.append("Name :" + res.getString(1) + "\n");
                            buffer.append("Sname :" + res.getString(2) + "\n");
                            //buffer.append("Address :"+res.getString(3)+"\n");
                            //buffer.append("Contact :"+res.getString(4)+"\n");
                            //buffer.append("Father :"+res.getString(5)+"\n");
                            buffer.append("Marks :" + res.getString(6) + "\n");
                        }
                        showMessage("Data", buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();


    }

}
