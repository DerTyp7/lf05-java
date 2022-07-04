package observer;

public class Programm {

    public static void main(String[] args) {
        Programm.doWork();
    }

    public static void doWork(){
        Feuerwehrmann feuerwehrmann1 = new Feuerwehrmann("Noah", "Ewert");
        Feuerwehrmann feuerwehrmann2 = new Feuerwehrmann("Justus", "Thiering");
        Brandmeister brandmeister = new Brandmeister();

        brandmeister.addObserver(feuerwehrmann1);
        brandmeister.addObserver(feuerwehrmann2);

        brandmeister.work();
    }
}
