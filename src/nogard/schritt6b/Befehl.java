package nogard.schritt6b;

/**
 * Objekte dieser Klasse halten Informationen �ber Befehle, die der Benutzer eingegeben hat. 
 * 
 * Ein Befehl besteht momentan aus zwei Zeichenketten: 
 * - einer ersten Zeichenkette, die das Schl�sselwort des Befehls angibt und 
 * - einer zweiten Zeichenkette, die einen Zusatz zum Befehl enth�lt.
 * 
 * Beim Befehl "go north" sind die beiden Zeichenketten des Befehls 
 * - "go" und 
 * - "north".
 * 
 * Wenn der Befehl nur aus einem Schl�sselwort besteht, dann ist das zweite Wort 'null'.
 */
public class Befehl {
	
    private String befehlsWort;
    private String befehlsZusatz;

    /**
     * Konstruktor.
     * @param befehlsWort 		Das Schl�sselwort des Befehls. 
     * 							Sollte 'null' sein, wenn dieser Befehl als nicht vom Spiel erkannt gekennzeichnet werden soll.
     * @param befehlsZusatz		Der Zusatz des Befehls.
     * 							Sollte 'null' sein, wenn der Befehl nur aus einem Schl�sselwort besteht.
     */
    public Befehl(String befehlsWort, String befehlsZusatz) {
        this.befehlsWort = befehlsWort;
        this.befehlsZusatz = befehlsZusatz;
    }

    /**
     * Liefert das Schl�sselwort des Befehls.
     * @return Das Schl�sselwort des Befehls.
     */
    public String getBefehlsWort() {
        return befehlsWort;
    }

    /**
     * Liefert den Zusatz zum Befehl.
     * Wenn es keinen Befehlszusatz gibt, ist das Ergebnis 'null'. 
     * @return Den Zusatz zum Befehl.
     */
    public String getBefehlsZusatz() {
        return befehlsZusatz;
    }
    
}

