package com.euniritter.gameshopping;

import android.app.Application;
import android.content.Context;


public class CriaJogos extends Application {

    JogoDAO dao = new JogoDAO();

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();}

    public void criaJogoNintendo () {

        dao.insereNintendo(new Jogo(1, R.drawable.
                nintendogopikachu, "Pokemon: Go Pikachu", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(2, R.drawable.
                nintendolegosuperviloes, "Lego: Super Viloes da DC", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(3, R.drawable.
                nintendolegowords, "Lego: Words", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(4, R.drawable.
                nintendomariokart8, "Mario Kart 8", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(5, R.drawable.
                nintendomariomaker2, "Mario Maker 2", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(6, R.drawable.
                nintendomarioodisey, "Mario Odisey", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(7, R.drawable.
                nintendomariosonicolimpic, "Mario VS Sonic: Olimpic", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(8, R.drawable.
                nintendopokemonpikachu, "Pokemon: Detetice Pikachu", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(9, R.drawable.
                nintendomedium, "Medium", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereNintendo(new Jogo(10, R.drawable.
                nintendoultrastreet, "Ultra Street Figther", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
    }

    public void criaJogosPlay () {

        dao.inserePlay(new Jogo(1, R.drawable.
                playdetroid, "Detroid", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(2, R.drawable.
                playassasinscreed, "Assassins Creed", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(3, R.drawable.
                playbattlefild4, "Battlefild 4", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(4, R.drawable.
                playdoom, "DOOM", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(5, R.drawable.
                playhorizonzero, "Horizon Zero", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(6, R.drawable.
                playinjustice2, "Injustice 2", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(7, R.drawable.
                playmafia_3, "Mafia 3", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(8, R.drawable.
                playspiderman, "Spider-man", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(9, R.drawable.
                playtombraider, "Tomb Raider", "Destroi amizades", "R$ 10,00", "2000", "play"));
        dao.inserePlay(new Jogo(10, R.drawable.
                playuncharted4, "Uncharted 4", "Destroi amizades", "R$ 10,00", "2000", "play"));
    }

    public void criaJogoXbox () {

        dao.insereXbox(new Jogo(1, R.drawable.
                xboxassasinscreedorigens, "Assassins Creed: Origens", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(2, R.drawable.
                xboxfortnite, "Fortnite", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(3, R.drawable.
                xboxforzahorizon4, "Forza Horizon 4", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(4, R.drawable.
                xboxgears2, "Gears 2", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(5, R.drawable.
                xboxgta5, "GTA 5", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(6, R.drawable.
                xboxjustcause4, "Just Cause 4", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(7, R.drawable.
                xboxmortalkombat11, "Mortal Kombat 11", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(8, R.drawable.
                xboxosincriveis, "Os Incriveis", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(9, R.drawable.
                xboxpugb, "PUGB", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
        dao.insereXbox(new Jogo(10, R.drawable.
                xboxwatchdogs2, "Watch Dogs 2", "Destroi amizades", "R$ 10,00", "2000","nintendo"));
    }

}