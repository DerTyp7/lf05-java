package observer;

public class Feuerwehrmann implements IObserver{
    private String vorname;
    private String nachname;


    public Feuerwehrmann(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public void notify(ICommand command) {
        command.execute();
    }
}
