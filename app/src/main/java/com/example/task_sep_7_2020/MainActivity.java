package com.example.task_sep_7_2020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {
    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    ArrayList<Item> itemArrayList;
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);


        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        supportMapFragment.getMapAsync(this);


//        recyclerView = findViewById(R.id.recycler_view);
//
//        initList();
//        adapter = new RecyclerViewAdapter(this,itemArrayList);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(adapter);

    }

    private void initList() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("New Trends", "Get new trendy video every day", R.drawable.logo));
        itemArrayList.add(new Item("New Trends", "Get new trendy video every day", R.drawable.logo));
        itemArrayList.add(new Item("New Trends", "Get new trendy video every day", R.drawable.logo));
        itemArrayList.add(new Item("New Trends", "Get new trendy video every day", R.drawable.logo));
        itemArrayList.add(new Item("New Trends", "Get new trendy video every day", R.drawable.logo));


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;

        LatLng latLng = new LatLng(24.8607, 67.0011);
        map.addMarker(new MarkerOptions().position(latLng).title(""));
        map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
    }
}