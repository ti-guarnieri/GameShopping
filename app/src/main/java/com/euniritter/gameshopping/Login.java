package com.euniritter.gameshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onClick2 (View view) {
        Intent intent = new Intent(this, Console.class);
        startActivity(intent);
    }
    public void onClick3 (View view) {
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }


}