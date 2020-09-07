package com.example.task_sep_7_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    ArrayList<Item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);

        initList();
        adapter = new RecyclerViewAdapter(this,itemArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private void initList() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("New Trends","Get new trendy video every day",R.drawable.logo));
        itemArrayList.add(new Item("New Trends","Get new trendy video every day",R.drawable.logo));
        itemArrayList.add(new Item("New Trends","Get new trendy video every day",R.drawable.logo));
        itemArrayList.add(new Item("New Trends","Get new trendy video every day",R.drawable.logo));
        itemArrayList.add(new Item("New Trends","Get new trendy video every day",R.drawable.logo));


    }
}