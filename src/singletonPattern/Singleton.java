package singletonPattern;

public class Singleton {
    private static Singleton instance;
    private String speicherOrt;

    private Singleton(String speicherOrt){
        this.speicherOrt = speicherOrt;
    }

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton("test");
        }
        return instance;
    }

    public String getSpeicherOrt() {
        return speicherOrt;
    }

    public void setSpeicherOrt(String speicherOrt) {
        this.speicherOrt = speicherOrt;
    }
}
