package nogard.schritt6.exceptions;

public class SpielerZuSchwachException extends Exception {
    private String text;

    public SpielerZuSchwachException() {
        text = "Der Spieler ist zu schwach";
    }

    public SpielerZuSchwachException(String text) {
        this.text = text;
    }

    @Override
    public String getMessage() {
        return text;
    }
}
