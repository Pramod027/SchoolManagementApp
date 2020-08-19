package com.practical.schoolmanagement;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "Student.db";
    public static final String TABLE_NAME = "student_table";
    public static final String COL_0 = "ID";
    public static final String COL_1 = "NAME";
    public static final String COL_2 = "SNAME";
    public static final String COL_3 = "ADDRESS";
    public static final String COL_4 = "CONTACT_NO";
    public static final String COL_5 = "PARENT_NAME";
   // public static final String COL_6 = "MARKS";
   // public static final String COL_7 = "ASSIGNMENT";
   // public static final String COL_8="CURRENTDATE";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        //whenever this method called database created
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //crate a table when this method is called
        //excel-executes whatever query written inside it
        db.execSQL("CREATE TABLE " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, NAME TEXT,SNAME TEXT,ADDRESS TEXT,CONTACT_NO TEXT,PARENT_NAME TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    //method to insert data

    public boolean insertData(String name, String sname, String address, String contact, String father) {
        //instance of database to write data
        SQLiteDatabase db = this.getWritableDatabase();

        //to put data into columns accept 2 values (column_name,value)
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_1, name);
        contentValues.put(COL_2, sname);
        contentValues.put(COL_3, address);
        contentValues.put(COL_4, contact);
        contentValues.put(COL_5, father);
      //  contentValues.put(COL_6, marks);
        //contentValues.put(COL_7, assignment);
        //contentValues.put(COL_8,date);
        long result = db.insert(TABLE_NAME, null, contentValues);//insert data(content values)in table(table_name)
        //test whether data is inserted or not result is used
        if (result == -1)
            return false;
        else
            return true;
        //Ctrl+mouse click to find about function
    }

    //Cursor used to show return value provided by database
    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery(" SELECT *FROM " + TABLE_NAME, null);
        return res;

    }

    public boolean updateData(String id, String name, String sname, String address, String contact, String father) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_0, id);
        contentValues.put(COL_1, name);
        contentValues.put(COL_2, sname);
        contentValues.put(COL_3, address);
        contentValues.put(COL_4, contact);
        contentValues.put(COL_5, father);
       // contentValues.put(COL_6, mark);
        //contentValues.put(COL_7, assignmen);
        //contentValues.put(COL_8,date);
        db.update(TABLE_NAME, contentValues, "id=? ", new String[]{id});
        return true;
    }

    //delete data using id
    public Integer deleteData(String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID =? ", new String[]{id});

    }


}
