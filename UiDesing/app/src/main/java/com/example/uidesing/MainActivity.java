package com.example.uidesing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


    }

    public void login(View view){

        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);

        startActivity(intent);
    }

    public void signup(View view){

        Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);

        startActivity(intent);
    }
}