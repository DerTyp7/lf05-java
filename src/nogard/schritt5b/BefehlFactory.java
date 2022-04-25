package  nogard.schritt5b;

import java.util.Arrays;

public class BefehlFactory {

    public static Befehl createBefehl(String input) throws BefehlUnbekanntException {
        Befehl b;
        if (input.length() == 0) {
            throw new BefehlUnbekanntException("Keine Argumente übergeben");
        } else {
            String[] befehl_str = input.toLowerCase().split(" ");
            String wort = befehl_str[0];
            b = switch (wort) {
                case "go" -> createGoBefehl(befehl_str);
                case "help", "quit" -> new Befehl(wort);
                default -> throw new BefehlUnbekanntException(wort + " ist kein definierter Befehl.");
            };
        }
        return b;
    }

    private static Befehl createGoBefehl(String[] befehl_str) throws BefehlUnbekanntException {
        if (befehl_str.length != 2) {
            throw new BefehlUnbekanntException("Befehl 'go' benötigt 2 parameter");
        }

        String befehl_wort = befehl_str[0];
        String befehl_zusatz = befehl_str[1];

        for (Richtungen r: Richtungen.values()) {
            if (r.name().equalsIgnoreCase(befehl_zusatz)) {
                return new Befehl(befehl_wort, befehl_zusatz);
            }
        }
        throw new BefehlUnbekanntException(befehl_zusatz + " ist keine valide Richtung.");
    }
}
