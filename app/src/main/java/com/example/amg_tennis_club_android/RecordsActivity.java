package com.example.amg_tennis_club_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecordsActivity extends AppCompatActivity {

    MyDbAdapter helper;
    Button backToHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);


        helper = new MyDbAdapter(this);

        Cursor res = helper.getData1();


        backToHome = findViewById(R.id.backToHome);


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


        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecordsActivity.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });



    }


}
