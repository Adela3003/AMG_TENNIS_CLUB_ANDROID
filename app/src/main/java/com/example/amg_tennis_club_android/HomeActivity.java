package com.example.amg_tennis_club_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView textView_name, textView_pass;
    Button button_logout;

    SharedPreferences sharedPreferences;

    Button btnInscriere, btnListaAntre;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";
    private static final String KEY_PASS = "password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        textView_name = findViewById(R.id.textFullName);
        textView_pass = findViewById(R.id.textPassword);
        button_logout = findViewById(R.id.buttonLogOut);

        btnInscriere = findViewById(R.id.inscriere);
        btnListaAntre = findViewById(R.id.listaAntre);

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);

        String name = sharedPreferences.getString(KEY_NAME, null);
        String password = sharedPreferences.getString(KEY_PASS, null);

        if(name != null || password != null) {
            textView_name.setText("Welcome, " + name + "!");
        }

        button_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name == null && password == null) {
                    startActivity(new Intent(HomeActivity.this, MainActivity.class));
                    finish();
                    Toast.makeText(HomeActivity.this, "LOGOUT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                }
                else {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.clear();
                    editor.commit();
                    finish();
                    Toast.makeText(HomeActivity.this, "LOGOUT SUCCESSFULLY", Toast.LENGTH_SHORT).show();
                    overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                }
            }
        });


        btnInscriere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FormInscriere());
            }
        });

        btnListaAntre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new ListaAntrenori());
            }
        });

    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
}