package  nogard.schritt5b;

public class GegenstandZuSchwerException extends Exception {
    private final String text;

    public GegenstandZuSchwerException(Gegenstand g) {
        text = "Ist zu schwer: " + g.getDescription();
    }
}
