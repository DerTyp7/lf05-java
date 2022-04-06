package  nogard.schritt5;

public class BefehlUnbekanntException extends Exception {
    private String befehl;

    public BefehlUnbekanntException(String befehl) {
        this.befehl = befehl;
    }

    @Override
    public String getMessage() {
        return befehl;
    }
}
