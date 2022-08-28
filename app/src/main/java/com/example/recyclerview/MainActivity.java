package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
String[] arr = {"gyade","Chutiya","manxe","ho","badal","pari","ko","gau","ramro","xa","Item1","Item2","Item3","Item4","Item5","Item6","Bingo","Man","Nishchal","Book1","Rich Dad","Psychology"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad = new CustomAdapter(arr);
        recyclerView.setAdapter(ad);
    }
}