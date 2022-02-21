package fussball;

public class Spiel {
    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis;
    private StringBuilder spielverlauf;

    public Spiel(Mannschaft heim, Mannschaft gast, Ergebnis ergebnis, StringBuilder spielverlauf) {
        this.heim = heim;
        this.gast = gast;
        this.ergebnis = ergebnis;
        this.spielverlauf = spielverlauf;
    }

    public String toString(){
        return heim.getName() + ": " + ergebnis.getTore1() ;
    }

    public Mannschaft getHeim() {
        return heim;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielverlauf() {
        return spielverlauf;
    }
}
