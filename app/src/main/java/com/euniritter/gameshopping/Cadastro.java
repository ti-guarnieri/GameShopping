package com.euniritter.gameshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    private ContactsContract.CommonDataKinds.Email email;
    private String senha;
    private boolean login = false;

    public int getEmail() {
        return R.id.activity_login_email;
    }

    public void setEmail(ContactsContract.CommonDataKinds.Email email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Criar Usuario");
        setContentView(R.layout.activity_cadastro);
    }

    public void onClick1 (View view) {

        Intent intent = new Intent( this, Console.class);
        startActivity(intent);


    }
}