package nogard.schritt6;

import nogard.schritt6.*;
import nogard.schritt6.Bereich;
import nogard.schritt6.Nahrung;
import nogard.schritt6.exceptions.GegenstandNichtVorhandenException;
import nogard.schritt6.exceptions.GegenstandZuSchwerException;
import nogard.schritt6.exceptions.SpielerSattException;
import nogard.schritt6.exceptions.SpielerZuSchwachException;

import java.util.LinkedList;

public class Spieler {
    private static final int FITNESS_max = 5000;
    private static final int VERBRAUCH_GEHEN = 500;

    private final String name;
    private final float max_traglast;
    private int fitness;
    private final LinkedList<Gegenstand> items;
    private nogard.schritt6.Bereich bereich;

    public Spieler(String name, float max_traglast, int fitness, nogard.schritt6.Bereich bereich) {
        this.name = name;
        this.max_traglast = max_traglast;
        this.fitness = fitness;
        items = new LinkedList<>();
        this.bereich = bereich;
    }

    /**
     * Berechnet das Gesamtgewicht aller items des Spielers.
     * @return Die Auslastung des Spielers.
     */
    public float getTraglast() {
        float total_weight_kg = 0;
        for (Gegenstand g: items) {
            total_weight_kg += g.getWeight_kg();
        }
        return total_weight_kg;
    }

    /**!
     * Sucht nach einem Gegenstand in dem derzeitigen Bereich.
     * @param name Der Name des aufzunehmenden Gegenstands.
     * @throws GegenstandZuSchwerException wenn das Aufnehmen des Gegenstands die Traglast überschreitet.
     * @throws GegenstandNichtVorhandenException wenn der Gegenstand nicht in dem Bereich vorhanden ist
     */
    public void aufnehmenGegenstand(String name) throws GegenstandZuSchwerException, GegenstandNichtVorhandenException {
        Gegenstand g = bereich.sucheGegenstand(name);

        if (getTraglast() + g.getWeight_kg() > max_traglast) {
            throw new GegenstandZuSchwerException(g);
        }

        bereich.entferneGegenstand(g);
        items.add(g);
    }

    /**
     * Entfernt den Gegenstand mittels des namens aus dem Inventar des spielers.
     * @param name Der name des Gegenstands.
     * @throws GegenstandNichtVorhandenException der Gegenstand befindet sich nicht in dem Inventar des Spielers
     */
    public void ablegenGegenstand(String name) throws GegenstandNichtVorhandenException {
        Gegenstand l_g = null;
        for (Gegenstand g: items) {
            if (g.getName().equals(name)) {
                l_g = g;
                break;
            }
        }

        if (l_g == null) {
            throw new GegenstandNichtVorhandenException(name);
        }
        bereich.platziereGegenstand(l_g);
        items.remove(l_g);
    }

    /**
     * Sucht nach Nahrung mithilfe des Namens in dem Bereich & isst es, wenn sie vorhanden ist
     * @param name Der Name der Nahrung
     * @throws GegenstandNichtVorhandenException die Nahrung ist nicht in dem Bereich vorhanden.
     * @throws SpielerSattException der Spieler kann nicht mehr essen.
     */
    public void essen(String name) throws GegenstandNichtVorhandenException, SpielerSattException {
        Gegenstand g = bereich.sucheGegenstand(name);

        boolean is_nahrung = g instanceof nogard.schritt6b.Nahrung;
        if (is_nahrung) {
            nogard.schritt6b.Nahrung n = (Nahrung) g;
            if (n.getNutrients() + fitness > FITNESS_max) {
                throw new SpielerSattException("Spieler ist Satt");
            }

            fitness += n.getNutrients();
        } else {
            throw new GegenstandNichtVorhandenException(name);
        }
    }

    /**
     * Wechselt den Bereich
     * @param b der neue Bereich.
     * @throws SpielerZuSchwachException der Spieler hat nicht genug Ausdauer für den wechsel.
     */
    public void geheInBereich(nogard.schritt6b.Bereich b) throws SpielerZuSchwachException {
        if (fitness - VERBRAUCH_GEHEN < 0) {
            throw new SpielerZuSchwachException();
        }

        fitness -= VERBRAUCH_GEHEN;
        bereich = b;
    }

    public Bereich getBereich() {
        return bereich;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Spieler:");
        sb.append("\n\tName: ").append(name);
        sb.append("\n\tFitness: ").append(fitness);
        sb.append("\n\tTraglast: ").append(getTraglast()).append("/").append(max_traglast);
        sb.append("\n\tItems: [");
        for (Gegenstand g: items) {
            sb.append(g.getName()).append(", ");
        }
        sb.append("]");
        sb.append("\n\tBereich: ").append(bereich.getBeschreibung());

        return sb.toString();
    }
}
