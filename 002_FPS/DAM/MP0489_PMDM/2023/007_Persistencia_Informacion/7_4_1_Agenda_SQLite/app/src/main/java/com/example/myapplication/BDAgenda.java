package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BDAgenda extends SQLiteOpenHelper {
    private static final String CREAR_TABLA="CREATE TABLE agenda(codigo INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, direccion TEXT)";

public BDAgenda(Context context,String name,SQLiteDatabase.CursorFactory factory, int version){
    super(context,name,factory,version);
}
    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(CREAR_TABLA);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(CREAR_TABLA);
    }
}
