package com.mansehej.intellify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.mansehej.intellify.adapters.classAdapter;
import com.mansehej.intellify.model.classData;
import com.mansehej.intellify.viewmodels.classViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<classData> attendanceList = new ArrayList<>();
    classAdapter classAdapter;
    RecyclerView rvHeadline;
    classViewModel classViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvHeadline = findViewById(R.id.rvNews);

        classViewModel = ViewModelProviders.of(this).get(classViewModel.class);
        classViewModel.init();
        classViewModel.getListCreator().observe(this, classList -> {
            List<classData> classDatas = classList.getoutput();
            attendanceList.addAll(classDatas);
            classAdapter.notifyDataSetChanged();
        });

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        if (classAdapter == null) {
            classAdapter = new classAdapter(MainActivity.this, attendanceList);
            rvHeadline.setLayoutManager(new LinearLayoutManager(this));
            rvHeadline.setAdapter(classAdapter);
            rvHeadline.setItemAnimator(new DefaultItemAnimator());
            rvHeadline.setNestedScrollingEnabled(true);
        } else {
            classAdapter.notifyDataSetChanged();
        }
    }

}
