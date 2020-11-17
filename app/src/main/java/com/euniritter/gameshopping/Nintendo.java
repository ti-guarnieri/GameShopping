package com.euniritter.gameshopping;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Nintendo extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);

        CriaJogos criaJogos = new CriaJogos();
        criaJogos.criaJogoNintendo();

        RecyclerView listaJogos = findViewById(R.id.recycle_view);

        JogoDAO dao = new JogoDAO();
        List<Jogo> todosJogos = dao.todos();
        listaJogos.setAdapter(new ListaAdapter(this, todosJogos));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listaJogos.setLayoutManager(layoutManager);


    }

}