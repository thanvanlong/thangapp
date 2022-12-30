package com.longtv.thangapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.longtv.thangapp.adapter.CommonAdapter;
import com.longtv.thangapp.utils.CompatibilityUtils;
import com.longtv.thangapp.utils.HorizontalItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcyTrending;
    private CommonAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcyTrending = findViewById(R.id.rcy_trending);
        rcyTrending.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // fake data
        List<String> list = new ArrayList<>();
        list.add("long dang cap");
        list.add("long dang cap");
        list.add("long dang cap");
        list.add("long dang cap");
        list.add("long dang cap");
        list.add("long dang cap");

        if (adapter == null) {
            adapter = new CommonAdapter(this, list);
            rcyTrending.addItemDecoration(new HorizontalItemDecoration(CompatibilityUtils.getItemSpacing(this)));
            rcyTrending.setAdapter(adapter);
        }

    }
}