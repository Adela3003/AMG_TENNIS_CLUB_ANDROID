package com.example.amg_tennis_club_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecordsActivity extends AppCompatActivity {

    MyDbAdapter helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

      //  String data = helper.getData();

        helper = new MyDbAdapter(this);

        Cursor res = helper.getData1();




        RecyclerView recyclerView = findViewById(R.id.recyclerview);


        List<Record> records = new ArrayList<Record>();
        while (res.moveToNext()) {
            String nume = res.getString(1);
            String email = res.getString(2);
            String varsta = res.getString(3);
            records.add(new Record(nume, email, varsta));
        }



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyRecordAdapter(getApplicationContext(), records));

    }


}
