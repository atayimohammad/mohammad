package com.example.mohammdreza_cr7.tblbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Contents extends AppCompatActivity {
    private ListView lv_content;
    private CustomAdapter adapter;
    private ArrayList<String> chapters;
    private DbHelper dbHelper;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content);
        lv_content = findViewById(R.id.lv_contents);
        dbHelper = new DbHelper(this);
        chapters = new ArrayList<>();
        adapter = new CustomAdapter(this,R.layout.chapters_row , chapters);
        lv_content . setAdapter(adapter);
        lv_content.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(Contents.this,Sections.class)
                        .putExtra("chapter", chapters.get(position)));

            }
        });


    }
    public void refresher(){
        dbHelper.opendatabase();
        int Num = dbHelper.shomaresh_field("chapter");
        for (int i = 0 ;  i < Num ; i++ ) {
            chapters.add(dbHelper.show_field("chapter", i));
        }

        dbHelper.close();
    }
}
