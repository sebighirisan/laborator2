package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Hindernislauf s1 = new Hindernislauf();
        Hochsprung s2 = new Hochsprung();
        Fussball s3 = new Fussball();
        Basketball s4 = new Basketball();

        List<Sport> sport = new ArrayList<>();
        sport.add(s1);
        sport.add(s2);
        sport.add(s3);
        sport.add(s4);

        Benutzer b1 = new Benutzer("Andrei", "Lupsor", sport);

        System.out.println(b1.toString());
        System.out.println("Kalkuliere Zeit insgesamt: " + b1.kalkuliereZeit());
        System.out.println("Kalkuliere Zeit fur sport s4 : " + b1.kalkuliereZeit(s4));
        System.out.println("Durchsnittlcihe Zeit: " + b1.kalkuliereDurchschnittszeit());
    }
}
