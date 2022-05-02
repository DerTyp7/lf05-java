package nogard.schritt6.commands;

import nogard.schritt6b.Richtungen;
import nogard.schritt6b.Spieler;
import nogard.schritt6b.exceptions.SpielerZuSchwachException;

public class CommandGo implements ICommand {
    private Spieler spieler;
    private Richtungen richtung;

    public CommandGo(Spieler spieler, Richtungen richtung) {
        this.spieler = spieler;
        this.richtung = richtung;
    }

    @Override
    public void execute() {
        try {
            spieler.geheInBereich(spieler.getBereich().getNachbar(richtung));
        } catch (SpielerZuSchwachException e) {
            System.out.println(e.getMessage());
        }
    }
}
