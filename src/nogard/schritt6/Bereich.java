package nogard.schritt6;

import nogard.schritt6.Gegenstand;
import nogard.schritt6.GegenstandNichtVorhandenException;
import nogard.schritt6.Richtungen;
import nogard.schritt6.exceptions.GegenstandNichtVorhandenException;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Diese Klasse modelliert Bereiche.Ein Bereich kann ein Gebiet, ein Haus, ein Raum etc. sein.
 * 
 * Jeder Bereich ist mit anderen Bereichen �ber Ausg�nge verbunden. M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * 
 * F�r jeden Ausgang h�lt ein Bereich eine Referenz auf den benachbarten Bereich parat.
 */
public class Bereich {

	private final String beschreibung;
	private final Map<Richtungen, Bereich> nachbarn;
	private final LinkedList<Gegenstand> gegenstaende;
	/**
     * Konstruktor.
     * @param beschreibung	Die Beschreibung des Areals.
     */
    public Bereich(String beschreibung) {
        this.beschreibung = beschreibung;
        nachbarn = new HashMap<>();
		gegenstaende = new LinkedList<>();

		for (Richtungen r: Richtungen.values()) {
			nachbarn.put(r, null);
		}
    }

    /**
     * Liefert die Beschreibung des Bereichs.
     * @return	Die Beschreibung des Bereichs.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

	/**
	 * Setzt den Nachbarn des Bereiches.
	 * @param r Die Richtung / Ort des Nachbarbereichs.
	 * @param n Der Nachbar welcher Relativ zu diesem Objekt liegt.
	 */
	public void setNachbar(Richtungen r, Bereich n) {
		nachbarn.put(r, n);
	}

	/**
	 *
	 * @param richtung Die Richtung in welcher ein Nachbar liegen könnte.
	 * @return Den Nachbarn in der angegebenen Richtung, oder NULL wenn in der Richtung kein Bereich liegt.
	 */
	public Bereich getNachbar(Richtungen richtung) {
		return nachbarn.get(richtung);
	}

	public void platziereGegenstand(Gegenstand g) {
		gegenstaende.add(g);
	}

	public void entferneGegenstand(Gegenstand g) throws GegenstandNichtVorhandenException {
		boolean success = gegenstaende.remove(g);
		if (!success) {
			throw new GegenstandNichtVorhandenException(g);
		}
	}

	public Gegenstand sucheGegenstand(String name) throws GegenstandNichtVorhandenException {
		for (Gegenstand g: gegenstaende) {
			if (g.getName().equalsIgnoreCase(name)) {
				return g;
			}
		}

		throw new GegenstandNichtVorhandenException(name);
	}

	public String getInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\tDu bist im Bereich ");
		sb.append(getBeschreibung());
		sb.append("\n\tDeine Nachbarn sind:");
		for (Map.Entry<Richtungen, Bereich> paar: nachbarn.entrySet()) {
			if (paar.getValue() != null) {
				sb.append("\n\t").append(paar.getKey().name());
			}
		}
		sb.append("\nGegenstaende:");
		for (Gegenstand g: gegenstaende) {
			sb.append("\n\t").append(g.getInfo());
		}

		return sb.toString();
	}
}
