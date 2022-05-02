package nogard.schritt6.commands;
import nogard.schritt6b.Spieler;
import nogard.schritt6b.exceptions.GegenstandNichtVorhandenException;
import nogard.schritt6b.exceptions.SpielerSattException;

public class CommandEat implements ICommand {
    private Spieler spieler;
    private String nahrung;

    public CommandEat(Spieler spieler, String nahrung) {
        this.spieler = spieler;
        this.nahrung = nahrung;
    }

    @Override
    public void execute() {
        try {
            spieler.essen(nahrung);
        } catch (GegenstandNichtVorhandenException | SpielerSattException e) {
            System.out.println(e.getMessage());
        }
    }
}
