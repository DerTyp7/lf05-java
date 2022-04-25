package  nogard.schritt5b;

import java.util.LinkedList;

public class Spieler {
    private final String name;
    private final float traglast;
    private final int fitness;
    private final LinkedList<Gegenstand> items;
    private final Bereich bereich;

    public Spieler(String name, float traglast, int fitness, Bereich bereich) {
        this.name = name;
        this.traglast = traglast;
        this.fitness = fitness;
        items = new LinkedList<>();
        this.bereich = bereich;
    }

    public float getTraglast() {
        float total_weight_kg = 0;
        for (Gegenstand g: items) {
            total_weight_kg += g.getWeight_kg();
        }
        return total_weight_kg;
    }

    public void aufnehmenGegenstand(Gegenstand g) {
        items.add(g);
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Spieler:");
        sb.append("\n\tName: ").append(name);
        sb.append("\n\tFitness: ").append(fitness);
        sb.append("\n\tTraglast: ").append(traglast);
        sb.append("\n\tItems: [");
        for (Gegenstand g: items) {
            sb.append(g.getName()).append(", ");
        }
        sb.append("\n\tBereich: ").append(bereich.getBeschreibung());

        return sb.toString();
    }
}
