package nogard.schritt6.commands;

import nogard.schritt6b.Spieler;

public class CommandInfo implements ICommand {
    private final Spieler spieler;

    public CommandInfo(Spieler spieler) {
        this.spieler = spieler;
    }

    @Override
    public void execute() {
        System.out.println(spieler.getInfo());
    }
}
