package nogard.schritt6.commands;

import nogard.schritt6b.Richtungen;
import nogard.schritt6b.Spieler;
import nogard.schritt6b.exceptions.BefehlUnbekanntException;

public class CommandFactory {
    public static ICommand createCommand(Spieler spieler, String input) throws BefehlUnbekanntException {
        String[] cmd_data = input.split(" ");

        return switch (cmd_data[0]) {
            case "go" -> new CommandGo(spieler, Richtungen.valueOf(cmd_data[1].toUpperCase()));
            case "take" -> new CommandTake(spieler, cmd_data[1]);
            case "put" -> new CommandPut(spieler, cmd_data[1]);
            case "info" -> new CommandInfo(spieler);
            case "quit" -> new CommandQuit();
            case "eat" -> new CommandEat(spieler, cmd_data[1]);
            default -> throw new BefehlUnbekanntException(input);
        };
    }
}
