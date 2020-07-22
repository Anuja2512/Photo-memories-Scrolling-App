package com.example.chuddybirthday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class youSlideshow extends AppCompatActivity {
    ViewPager viewPager;
    youCustomSwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_slideshow);


        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new youCustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
