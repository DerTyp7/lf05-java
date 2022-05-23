package kaufvertrag;

import java.util.List;

public class Ware {
    private String bezeichnung;
    private String beschreibung;
    private double preis;
    private List<String> besonderheiten;
    private List<String> maengel;

    public Ware(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public List<String> getBesonderheiten() {
        return besonderheiten;
    }

    public void setBesonderheiten(List<String> besonderheiten) {
        this.besonderheiten = besonderheiten;
    }

    public List<String> getMaengel() {
        return maengel;
    }

    public void setMaengel(List<String> maengel) {
        this.maengel = maengel;
    }

    @Override
    public String toString() {
        return "Ware{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", preis=" + preis +
                ", besonderheiten=" + besonderheiten +
                ", maengel=" + maengel +
                '}';
    }
}
