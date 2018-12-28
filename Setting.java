package com.example.mohammdreza_cr7.tblbook;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Setting extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private Spinner sb_font_size;
    private RadioGroup rg_mode;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        sharedPreferences = getSharedPreferences("setting" , MODE_PRIVATE);
        sb_font_size = findViewById(R.id.sp_select_font);

    }
}
