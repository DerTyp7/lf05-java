package nogard.schritt3;

public class BefehlUnbekanntException extends Exception {
    private String message = "Befehl nicht bekannt";

    @Override
    public String getMessage() {
        return message;
    }
}
