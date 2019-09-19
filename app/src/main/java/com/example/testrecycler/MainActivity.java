package com.example.testrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DrawerLayout Drawer = findViewById(R.id.Drawer);

        Button btndrawer = findViewById(R.id.btndrawer);
        btndrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Drawer.openDrawer(Gravity.RIGHT);

            }
        });

        ArrayList<String> list = new ArrayList<String>();
        list.add("Profile");
        list.add("Dial");

        RecyclerView recycler = findViewById(R.id.recycler);
        RecyclerAdapter adapter = new RecyclerAdapter(list);
        recycler.setAdapter(adapter);

        recycler.setLayoutManager(new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false));

    }


}
