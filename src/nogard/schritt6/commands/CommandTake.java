package nogard.schritt6.commands;

import nogard.schritt6b.Spieler;
import nogard.schritt6b.exceptions.GegenstandNichtVorhandenException;
import nogard.schritt6b.exceptions.GegenstandZuSchwerException;

public class CommandTake implements ICommand {
    private Spieler spieler;
    private String gegenstand;

    public CommandTake(Spieler spieler, String gegenstand) {
        this.spieler = spieler;
        this.gegenstand = gegenstand;
    }

    @Override
    public void execute() {
        try {
            spieler.aufnehmenGegenstand(gegenstand);
        } catch (GegenstandNichtVorhandenException | GegenstandZuSchwerException e) {
            System.out.println(e.getMessage());
        }
    }
}
