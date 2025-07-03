package com.example.myapp;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ConcertAdapter adapter;
    List<Concert> concertList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        concertList = new ArrayList<>();
        concertList.add(new Concert("뮤지컬 멤피스", "2025-06-24"));
        concertList.add(new Concert("NCT127 콘서트", "2025-01-27"));

        adapter = new ConcertAdapter(concertList);
        recyclerView.setAdapter(adapter);
    }
}