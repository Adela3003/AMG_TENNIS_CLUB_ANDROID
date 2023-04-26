package com.example.amg_tennis_club_android;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecordViewHolder extends RecyclerView.ViewHolder{

    TextView nume, email, varsta;
    public MyRecordViewHolder(@NonNull View itemView) {
        super(itemView);

        nume = itemView.findViewById(R.id.nume);
        email = itemView.findViewById(R.id.email);
        varsta = itemView.findViewById(R.id.varsta);
    }
}
