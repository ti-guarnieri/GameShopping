package com.euniritter.gameshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Cadastro cadastro = new Cadastro();

    public void onClick1 (View view) {
        if (cadastro.getLogin() == false){
        Intent intent = new Intent( this, Console.class);
        startActivity(intent);}
        else {Intent intent = new Intent( this, Login.class);
            startActivity(intent);
        }

    }

}