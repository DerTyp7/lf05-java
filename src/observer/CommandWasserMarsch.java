package observer;

public class CommandWasserMarsch implements ICommand {
    @Override
    public void execute() {
        System.out.println("WASSA!");
    }
}
