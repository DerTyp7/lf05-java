package  nogard.schritt5b;

public class Befehl {
    private final String befehl_wort;
    private final String befehl_zusatz;

    public Befehl(String wort) {
        befehl_wort = wort;
        befehl_zusatz = null;
    }

    public Befehl(String wort, String zusatz) {
        befehl_wort = wort;
        befehl_zusatz = zusatz;
    }

    public String getWort() {
        return befehl_wort;
    }

    public String getZusatz() {
        return befehl_zusatz;
    }


}
