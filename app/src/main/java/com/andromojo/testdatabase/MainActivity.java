package com.andromojo.testdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {
    TextView lst;
    ArrayList<Student> studentArrayList;
    RecyclerView rcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyDBHandler dbHandler = new MyDBHandler(this,null,null,2);
        studentArrayList = new ArrayList<>();
        studentArrayList.clear();

        studentArrayList = dbHandler.loadHandler();

        rcv = (RecyclerView) findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        //CustomAdapter customAdapter = new CustomAdapter(studentArrayList);

        String arr[] = {"c", "c++", "java", "python", ".net", "c#"};
        rcv.setAdapter(new CustomAdapter(studentArrayList));

        //lst.setText(studentArrayList);
    }
}