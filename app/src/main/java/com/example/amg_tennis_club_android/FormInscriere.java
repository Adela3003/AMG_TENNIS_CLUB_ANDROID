package com.example.amg_tennis_club_android;

import static com.facebook.FacebookSdk.getApplicationContext;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FormInscriere extends Fragment {

    View view;
    Activity context;
    MyDbAdapter helper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        view = inflater.inflate(R.layout.fragment_form_inscriere, container, false);
        return view;
    }

    public void onStart(){
        super.onStart();
        Button addBtn = (Button) context.findViewById(R.id.add);
        EditText nume = (EditText) context.findViewById(R.id.editName);
        EditText email = (EditText) context.findViewById(R.id.editEmail);
        EditText varsta = (EditText) context.findViewById(R.id.editAge);
        helper = new MyDbAdapter(getContext());
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t1 = nume.getText().toString();
                String t2 = email.getText().toString();
                String t3 = varsta.getText().toString();

                if(t1.isEmpty() || t2.isEmpty() || t3.isEmpty())
                {
                    Message.message(getApplicationContext(),"Enter Both Name and Password");
                }
                else
                {
                    long id = helper.insertData(t1,t2,t3);
                    if(id<=0)
                    {
                        Message.message(getApplicationContext(),"Insertion Unsuccessful");
                        nume.setText("");
                        email.setText("");
                        varsta.setText("");
                    } else
                    {
                        Message.message(getApplicationContext(),"Insertion Successful");
                        nume.setText("");
                        email.setText("");
                        varsta.setText("");
                    }
                }
            }
        });
    }
}