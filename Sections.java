package com.example.mohammdreza_cr7.tblbook;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Sections extends AppCompatActivity {
    private ListView lv_section;
    private ArrayAdapter adapter;
    private ArrayList<String> sections;
    private String chapters;
    private DbHelper dbHelper;
    private ArrayList<Integer> stars;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.section);
        lv_section = findViewById(R.id.lv_sections);
        Intent intent = getIntent();
        intent.getStringExtra("chapter");
        dbHelper = new DbHelper(this);
        refresher (chapters);
        adapter = new CustomAdapter(this, R.layout.section_row, sections, stars);
        lv_section . setAdapter(adapter);
        lv_section . setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(Sections.this, PageActivity.class).putExtra("section",sections.get(position))
                        .putExtra("chapter" , chapters));


            }
        });
    }
        public void refresher(String chapters){

        }
}
