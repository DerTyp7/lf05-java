package nogard.schritt6.exceptions;

import nogard.schritt6b.Gegenstand;

public class GegenstandNichtVorhandenException extends Exception {
    private final String text;
    public GegenstandNichtVorhandenException(Gegenstand g) {
        StringBuilder sb = new StringBuilder();
        sb.append(g.getInfo());
        sb.append("Ist nicht in dem Bereich vorhanden.");
        text = sb.toString();
    }

    public GegenstandNichtVorhandenException(String text) {
        this.text = text;
    }

    @Override
    public String getMessage() {
        return text;
    }
}
