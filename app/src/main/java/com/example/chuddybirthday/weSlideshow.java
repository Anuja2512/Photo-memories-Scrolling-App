package com.example.chuddybirthday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class weSlideshow extends AppCompatActivity {
    ViewPager viewPager;
    weCustomSwipeAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_slideshow);


        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new weCustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
