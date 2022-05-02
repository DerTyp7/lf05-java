package nogard.schritt6.commands;

import nogard.schritt6b.Spieler;
import nogard.schritt6b.exceptions.GegenstandNichtVorhandenException;

public class CommandPut implements ICommand {
    private Spieler spieler;
    private String gegenstand;

    public CommandPut(Spieler spieler, String gegenstand) {
        this.spieler = spieler;
        this.gegenstand = gegenstand;
    }

    @Override
    public void execute() {
        try {
            spieler.ablegenGegenstand(gegenstand);
        } catch (GegenstandNichtVorhandenException e) {
            System.out.println(e.getMessage());
        }
    }
}
