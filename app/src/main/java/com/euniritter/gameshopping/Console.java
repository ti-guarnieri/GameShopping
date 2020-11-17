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

    public void vaiParaNintendo (View view) { startActivity(new Intent(this, Nintendo.class));}
    public void vaiParaPlay (View view) { startActivity(new Intent(this, Play.class));}
    public void vaiParaXbox (View view) { startActivity(new Intent(this, Xbox.class));}

}
