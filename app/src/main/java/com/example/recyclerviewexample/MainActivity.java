package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<User> userList = new ArrayList<>();

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvUserList);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        UserListAdapter adapter = new UserListAdapter();

        recyclerView.setAdapter(adapter);

        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));
        userList.add(new User("1","1212121212121"));

        adapter.setData(userList);

    }
}