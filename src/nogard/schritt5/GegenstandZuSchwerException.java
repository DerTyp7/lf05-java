package  nogard.schritt5;

public class GegenstandZuSchwerException extends Exception {
    private final String text;

    public GegenstandZuSchwerException(Gegenstand g) {
        text = "Ist zu schwer: " + g.getDescription();
    }
}
