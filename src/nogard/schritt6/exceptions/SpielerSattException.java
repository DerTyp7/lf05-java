package nogard.schritt6.exceptions;

public class SpielerSattException extends Exception {
    private final String text;

    public SpielerSattException(String text) {
        this.text = text;
    }

    @Override
    public String getMessage() {
        return text;
    }
}
