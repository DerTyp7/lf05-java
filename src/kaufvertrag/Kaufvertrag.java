package kaufvertrag;

public class Kaufvertrag {
    private Vertragspartner verkaeufer;
    private Vertragspartner kaeufer;
    private Ware ware;
    private String zahlungsModalitaeten;

    public Kaufvertrag(Vertragspartner kaeufer, Vertragspartner verkaeufer, Ware ware) {
        this.kaeufer = kaeufer;
        this.verkaeufer = verkaeufer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public void setVerkaeufer(Vertragspartner verkaeufer) {
        this.verkaeufer = verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    @Override
    public String toString() {
        // String output = verkaeufer.getVorname() + " " + verkaeufer.getNachname() + "
        // verkauft ein/en " + ware.getBezeichnung() + " an " + kaeufer.getVorname()+ "
        // " + kaeufer.getNachname() +" fuer " + ware.getPreis() + " Euro.";

        String output = "Vertragspartner;Name;Vorname;\n" + "Verkaeufer;" + verkaeufer.getVorname() + ";"
                + verkaeufer.getNachname() + ";\n" + "Kaeufer;" + kaeufer.getVorname() + ";" + kaeufer.getNachname()
                + ";\n\n" + "Menge;Name;Preis;\n" + "1;" + ware.getBezeichnung() + ";" + ware.getPreis() + ";";
        return output;
    }
}
