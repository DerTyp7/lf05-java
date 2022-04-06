package nogard.schritt0;

/**
 * Diese Klasse modelliert Bereiche. Ein Bereich kann ein Gebiet, ein Haus, ein Raum etc. sein.
 * 
 * Jeder Bereich ist mit anderen Bereichen über Ausgänge verbunden. Mögliche Ausgänge liegen im Norden, Osten, Süden und Westen.
 * 
 * Für jeden Ausgang hält ein Bereich eine Referenz auf den benachbarten Bereich parat.
 */
public class Bereich {

	private String beschreibung;
    private Bereich nord;
    private Bereich ost;
    private Bereich sued;
    private Bereich west;

    /**
     * Konstruktor.
     * @param beschreibung	Die Beschreibung des Areals.
     */
    public Bereich(String beschreibung) {
        this.beschreibung = beschreibung;
        nord = null;
        ost = null;
        sued = null;
        west = null;
    }

    /**
     * Liefert die Beschreibung des Bereichs.
     * @return	Die Beschreibung des Bereichs.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Definiert die benachbarten Bereiche des Bereichs. 
     * Jede Richtung führt entweder in einen anderen Bereich oder ist 'null' (kein Ausgang).
     * @param nord	Der im Norden benachbarte Bereich.
     * @param ost	Der im Osten benachbarte Bereich.
     * @param sued	Der im Süden benachbarte Bereich.
     * @param west	Der im Westen benachbarte Bereich.
     */
    public void setNachbarn(Bereich nord, Bereich ost, Bereich sued, Bereich west) {
        this.nord = nord;
        this.ost = ost;
        this.sued = sued;
        this.west = west;
    }

	/**
	 * Liefert den im Norden benachbarten Bereich.
	 * @return Den im Norden benachbarten Bereich.
	 */
	public Bereich getNord() {
		return nord;
	}

	/**
	 * Liefert den im Osten benachbarten Bereich.
	 * @return Den im Osten benachbarten Bereich.
	 */
	public Bereich getOst() {
		return ost;
	}

	/**
	 * Liefert den im Süden benachbarten Bereich.
	 * @return Den im Süden benachbarten Bereich.
	 */
	public Bereich getSued() {
		return sued;
	}

	/**
	 * Liefert den im Westen benachbarten Bereich.
	 * @return Den im Westen benachbarten Bereich.
	 */
	public Bereich getWest() {
		return west;
	}

}
