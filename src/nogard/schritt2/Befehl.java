package nogard.schritt2;

public class Befehl{
    private String befehlsWort;
    private String befehlsSatz;



    public Befehl(String befehlsWort) {
        this.befehlsWort = befehlsWort;
        this.befehlsSatz = null;
    }


    public Befehl(String befehlsWort, String befehlsSatz) {
        this.befehlsWort = befehlsWort;
        this.befehlsSatz = befehlsSatz;
    }

    public String getBefehlsSatz() {
        return befehlsSatz;
    }

    public String getBefehlsWort() {
        return befehlsWort;
    }
}
