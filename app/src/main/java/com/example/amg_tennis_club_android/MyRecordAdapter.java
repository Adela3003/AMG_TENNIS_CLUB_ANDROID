package com.example.amg_tennis_club_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecordAdapter extends RecyclerView.Adapter<MyRecordViewHolder>{


    Context context;
    List<Record> records;

    public MyRecordAdapter(Context context, List<Record> records) {
        this.context = context;
        this.records = records;
    }

    @NonNull
    @Override
    public MyRecordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyRecordViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecordViewHolder holder, int position) {
         holder.nume.setText(records.get(position).getNume());
         holder.email.setText(records.get(position).getEmail());
         holder.varsta.setText(records.get(position).getVarsta());
    }

    @Override
    public int getItemCount() {
        return records.size();
    }
}
