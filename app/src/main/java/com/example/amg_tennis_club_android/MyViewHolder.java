package com.example.amg_tennis_club_android;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView image;
    TextView nume, email, specialitate, varsta;



    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.imageview);
        nume = itemView.findViewById(R.id.nume);
        email = itemView.findViewById(R.id.email);
        specialitate = itemView.findViewById(R.id.specialitate);
        varsta = itemView.findViewById(R.id.varsta);
    }
}
