package com.example.chuddybirthday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {
    Button child,food,snaps,we,you,memory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        child=findViewById(R.id.childhoodBtn);
        food=findViewById(R.id.hungerBtn);
        snaps=findViewById(R.id.snapsBtn);
        we=findViewById(R.id.weBtn);
        you=findViewById(R.id.youBtn);
        memory=findViewById(R.id.memoryBtn);
        memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childIntent=new Intent(DashboardActivity.this,MemoryActivity.class);
                startActivity(childIntent);
            }
        });
        child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childIntent=new Intent(DashboardActivity.this,SlideshowActivity.class);
                startActivity(childIntent);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childIntent=new Intent(DashboardActivity.this,HungerSlideshow.class);
                startActivity(childIntent);
            }
        });
        snaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childIntent=new Intent(DashboardActivity.this,snapsSlideshow.class);
                startActivity(childIntent);
            }
        });
        we.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childIntent=new Intent(DashboardActivity.this,weSlideshow.class);
                startActivity(childIntent);
            }
        });
        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent childIntent=new Intent(DashboardActivity.this,youSlideshow.class);
                startActivity(childIntent);
            }
        });
    }
}
