package nogard.schritt6.exceptions;

import nogard.schritt6b.Gegenstand;

public class GegenstandZuSchwerException extends Exception {
    private final String text;

    public GegenstandZuSchwerException(Gegenstand g) {
        text = "Ist zu schwer: " + g.getDescription();
    }

    public GegenstandZuSchwerException(String text) {
        this.text = text;
    }

    @Override
    public String getMessage() {
        return text;
    }
}
