package fussball;

public class Trainer extends Person{
    private int erfahrung;

    public Trainer(String name, int alter, int erfahrung){
        super(name, alter);
        this.erfahrung = erfahrung;
    }

    public int getErfahrung(){
        return this.erfahrung;
    }

    public void setErfahrung(int newErfahrung){
        this.erfahrung = newErfahrung;
    }

    public String toString(){
        String erfahrungStr = "Erfahrung: " + this.erfahrung + "\n";

        return erfahrungStr;
    }
}
