package com.practical.schoolmanagement;

import android.database.Cursor;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentDetails extends AppCompatActivity {

    EditText editName,editSName,editAddress,editId,editFather,editContact,editMarks,editAssign,editDate,editAttendance;
    Button addbtn;
    //Button deletebtn;
    Button viewbtn;
    Button updatebtn;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        editName=(EditText)findViewById(R.id.editText1);
        editSName=(EditText)findViewById(R.id.editText2);
        editAddress=(EditText)findViewById(R.id.editText3);
        editId=(EditText)findViewById(R.id.editText);
        editContact=(EditText)findViewById(R.id.editText4);
        editFather=(EditText)findViewById(R.id.editText5);
        //editMarks=(EditText)findViewById(R.id.editText6);
       // editAssign=(EditText)findViewById(R.id.editText7) ;
        //editDate=(EditText)findViewById(R.id.editText8);
        //editAttendance=(EditText)findViewById(R.id.textView9);

        addbtn=(Button)findViewById(R.id.button2);
       // deletebtn=(Button)findViewById(R.id.button3);
        viewbtn=(Button)findViewById(R.id.button4);
        updatebtn=(Button)findViewById(R.id.button5);


        //call the constructor where a database and table is created
        myDb=new DatabaseHelper(this);
        AddData();
        viewAll();
        updateData();
       // deleteData();

    }
    public void AddData(){
        addbtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean Inserted=myDb.insertData(editName.getText().toString(),editSName.getText().toString(),editAddress.getText().toString(),editContact.getText().toString(),editFather.getText().toString());
                        if(Inserted==true)
                            Toast.makeText(StudentDetails.this,"Data inserted successfully",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(StudentDetails.this,"Data not inserted",Toast.LENGTH_LONG).show();
                    }

                }
        );
    }
    public void viewAll(){
        viewbtn.setOnClickListener(
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
                        while (res.moveToNext()){
                            buffer.append("Id :"+res.getString(0)+"\n");
                            buffer.append("Name :"+ res.getString(1)+"\n");
                            buffer.append("Sname :"+res.getString(2)+"\n");
                            buffer.append("Address :"+res.getString(3)+"\n");
                            buffer.append("Contact :"+res.getString(4)+"\n");
                            buffer.append("Father :"+res.getString(5)+"\n");
                            //buffer.append("Date :"+res.getString(8)+"\n");
                        }
                        showMessage("Data",buffer.toString());
                    }
                }
        );
    }
    //to show an alert message/dialog
    public void showMessage(String title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();

    }
    public void updateData(){
        updatebtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdated= myDb.updateData(editId.getText().toString(),editName.getText().toString(),editSName.getText().toString(),editAddress.getText().toString(),editContact.getText().toString(),editFather.getText().toString());
                        if(isUpdated==true)
                            Toast.makeText(StudentDetails.this,"Data updated",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(StudentDetails.this,"Data not updated",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    /*
    public void deleteData(){
        deletebtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRow=myDb.deleteData(editId.getText().toString());
                        if(deletedRow > 0)
                            Toast.makeText(StudentDetails.this,"Data Deleted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(StudentDetails.this,"Data not deleted",Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
    */
}
