package com.company;

import com.company.Sport;

import java.util.List;

public  class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sport;

    //Default Constructor
    public Benutzer() {
    }

    //Constructor with parameters
    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public void setSport(List<Sport> sport) {
        this.sport = sport;
    }

    public String getVorName() {

        return vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public List<Sport> getSport() {
        return sport;
    }

    @Override
    public String toString() {
        return "com.company.Benutzer{" +
                "vorName='" + vorName + '\'' +
                ", nachName='" + nachName + '\'' +
                '}';
    }

    public double kalkuliereZeit(){
        double total = 0;
        for(Sport s : sport){
            total = total + s.kalkuliereZeit();
        }
        return total;
    }

    public double kalkuliereZeit(Sport s){
        return s.kalkuliereZeit();
    }

    public double kalkuliereDurchschnittszeit(){
        double sum = 0;
        for(Sport s : sport){
            sum = sum + s.kalkuliereZeit();
        }
        return sum/sport.size();
    }

}



