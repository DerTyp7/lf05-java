package fussball;

import java.util.ArrayList;

public class Mannschaft {
    private String name;
    private Torwart torwart;
    private Trainer trainer;
    private ArrayList<Spieler> spielerList;


    public Mannschaft(String name, Torwart torwart, Trainer trainer, ArrayList<Spieler> spielerList) {
        this.name = name;
        this.torwart = torwart;
        this.trainer = trainer;
        this.spielerList = spielerList;
    }
    
    public int getMotivation(){
        int motivation = 0;

        for (Spieler spieler: spielerList) {
            motivation += spieler.getMotivation();
        }
        motivation += torwart.getMotivation();

        return (motivation / (spielerList.size() + 1));
    }

    public int getStaerke(){
        int staerke = 0;

        for (Spieler spieler: spielerList) {
            staerke += spieler.getStaerke();
        }
        staerke += torwart.getStaerke();

        return (staerke / (spielerList.size() + 1));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public ArrayList<Spieler> getSpielerList() {
        return spielerList;
    }

    public void setSpielerList(ArrayList<Spieler> spielerList) {
        this.spielerList = spielerList;
    }
}
