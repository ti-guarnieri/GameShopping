package com.euniritter.gameshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Console extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_console);
    }
    public void irPlay (View view) {
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }
    public void irXbox (View view) {
        Intent intent = new Intent(this, Xbox.class);
        startActivity(intent);
    }
    public void irNintendo (View view) {
        Intent intent = new Intent(this, Nintendo.class);
        startActivity(intent);
    }
}