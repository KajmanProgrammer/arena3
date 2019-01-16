package com.example.arena.model.miejscaWalki;

public abstract class ObiektInfrastruktury {

    private String nazwaObiektu;

    private int [][] polozenie;

    public ObiektInfrastruktury(String nazwaObiektu, int [][] polozenie){
        this.nazwaObiektu=nazwaObiektu;
        this.polozenie=polozenie;
    }

}
