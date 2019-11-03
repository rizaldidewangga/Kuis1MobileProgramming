package com.example.kuis1mprecycleview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_1);

        adapter = new KeluargaAdapter(keluargaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Hartono", "Ayah","28 Februari 1963" , R.drawable.ayah));
        keluargaArrayList.add(new Keluarga("Suswinarti", "Ibu", "30 Juni 1973" , R.drawable.ibu));
        keluargaArrayList.add(new Keluarga("Nana Rizky Widyasari", "Nana", "7 November 1995" , R.drawable.nana));
        keluargaArrayList.add(new Keluarga("Rizaldi Zuhal Dewangga", "Rizal", "24 April 1999" , R.drawable.rizal));
    }
}


