package nogard.schritt5;

/**
 * Diese Klasse modelliert Nahrung als einen speziellen Gegenstand.
 */
public class Nahrung extends Gegenstand {

	private int naehrwert;
	
	/**
	 * Konstruktor
	 * @param name			Der Name der Nahrung.
	 * @param beschreibung	Die Beschreibung der Nahrung.
	 * @param naehrwert		Der Nährwert der Nahrung in Kilokalorien (kcal).
	 */
	public Nahrung(String name, String beschreibung, int naehrwert) {
		super(name, beschreibung, 0);
		this.naehrwert = naehrwert;
	}
	
	/**
     * Liefert den Nährwert der Nahrung in Kilokalorien (kcal).
     * @return	Der Nährwert der Nahrung in Kilokalorien (kcal).
	 */
	public int getNaehrwert() {
		return naehrwert;
	}
	
	/**
	 * Gibt die Informationen über die Nahrung zurück.
	 * @return	Die Informationen über die Nahrung.
	 */
	@Override
	public String getInfo() {
		return getName() + " " + getBeschreibung() + " mit einem Nährwert von " + naehrwert + " kcal";
	}

}
