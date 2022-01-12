package com.example.a7rv_as_gridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.a7rv_as_gridview.adapter.CustomAdapter;
import com.example.a7rv_as_gridview.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private Context context;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<User>users = prepareUserList();
        refreshAdapter(users);
    }

    private List<User> prepareUserList() {
        List<User> users = new ArrayList<>();
        for (int i =1; i<20; i++){
            users.add(new User(i+" Ortig'aliyev",i+" Abubakr "));
        }
        return users;
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,2));

    }
    private void refreshAdapter(List<User> users){
        CustomAdapter adapter = new CustomAdapter(context,users);
        recyclerView.setAdapter(adapter);
    }


}