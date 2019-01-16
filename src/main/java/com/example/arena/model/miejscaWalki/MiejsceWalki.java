package com.example.arena.model.miejscaWalki;

import java.util.List;

public abstract class MiejsceWalki {

    private int plansza [][];

    private List<? extends ObiektInfrastruktury> obiekty;

    public MiejsceWalki(int [][] plansza, List<? extends ObiektInfrastruktury> obiekty){
        this.plansza=plansza;
        this.obiekty=obiekty;
    }
}
