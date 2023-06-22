package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RecyclerView recycler = findViewById(R.id.clock);
        int[] ids = new int[3];
            ids[0]=R.drawable.icon3;
            ids[1]=R.drawable.icon4;
            ids[2]=R.drawable.icon5;


        recycler.setLayoutManager(new LinearLayoutManager(this));
        Cadapter adapter = new Cadapter(ids);

        recycler.setAdapter(adapter);



    }
}