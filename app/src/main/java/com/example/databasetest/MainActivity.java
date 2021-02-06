package com.example.databasetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.databasetest.room.WordDao;
import com.example.databasetest.room.WordDataBase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    WordDataBase wordDataBase;
    WordDao wordDao;
    Button buttonInsert,buttonUpdate,buttonDelete,buttonClear;
     private  MyDatabaseHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbHelper=new MyDatabaseHelper(this,"BookStore.db",null,1);
        Button createDatabase=findViewById(R.id.create_table);
        buttonInsert=findViewById(R.id.button_insert);
        buttonUpdate=findViewById(R.id.button_update);
        buttonDelete=findViewById(R.id.button_delete);
        buttonClear=findViewById(R.id.button_clear);
        buttonInsert.setOnClickListener(this);
        buttonUpdate.setOnClickListener(this);
        buttonDelete.setOnClickListener(this);
        buttonClear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.create_table:
                CreatTable();
            case R.id.button_insert:
                InsertWord();
            case R.id.button_update:
                UpdateWord();
            case R.id.button_delete:
                DeleteWords();
            case R.id.button_clear:
                ClearWords();
        }
    }

    private void UpdateWord() {
    }

    private void ClearWords() {
    }

    private void DeleteWords() {
    }

    private void InsertWord() {
    }

    private void CreatTable() {
        dbHelper.getWritableDatabase();
    }
}