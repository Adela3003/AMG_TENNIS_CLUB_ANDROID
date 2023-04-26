package com.example.amg_tennis_club_android;

import static com.facebook.FacebookSdk.getApplicationContext;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;


public class ListaAntrenori extends Fragment {

    View view;
    Activity context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity();
        view = inflater.inflate(R.layout.fragment_lista_antrenori, container, false);
        return view;
    }

    public void onStart(){
        super.onStart();

        RecyclerView recyclerView = (RecyclerView) context.findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();

        items.add(new Item("Popescu Daniela", "daniela.popescu@gmail.com", "coach for beginner players", "34", R.drawable.popescudaniela));
        items.add(new Item("Stroe Bogdan", "bogdan.stroe@gmail.com", "coach for beginner players", "39", R.drawable.stroebogdan));
        items.add(new Item("Georgescu Ioana", "ioana.georgescu@gmail.com", "coach for middle level players", "30", R.drawable.georgescuioana));
        items.add(new Item("Toma Alexandru", "alexandru.toma@gmail.com", "coach for middle level players", "40", R.drawable.tomaalexandru));
        items.add(new Item("Davidescu Anastasia", "anastasia.davidescu@gmail.com", "coach for professional players", "35", R.drawable.davidescuanastasia));
        items.add(new Item("Paraschiv Luca", "luca.paraschiv@gmail.com", "coach for professional players", "33", R.drawable.paraschivluca));




        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}