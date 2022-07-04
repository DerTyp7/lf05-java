package observer;

import java.util.ArrayList;

public class Brandmeister {
    private ArrayList<IObserver> befehlsEmpfaengerListe = new ArrayList<IObserver>();

    public void addObserver(IObserver observer){
        befehlsEmpfaengerListe.add(observer);
    }

    public void removeObserver(IObserver observer){
        befehlsEmpfaengerListe.remove(observer);
    }

    public void work(){
        ICommand commandWasserMarsch = new CommandWasserMarsch();
        notifyObserver(commandWasserMarsch);
    }

    private void notifyObserver(ICommand command){
        for (IObserver o: befehlsEmpfaengerListe) {
            o.notify(command);
        }
    }
}
