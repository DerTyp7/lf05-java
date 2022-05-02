package nogard.schritt6.exceptions;

public class BefehlUnbekanntException extends Exception {
    private final String befehl;

    public BefehlUnbekanntException(String befehl) {
        this.befehl = befehl;
    }

    @Override
    public String getMessage() {
        return befehl;
    }
}
