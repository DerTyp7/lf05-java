package nogard.schritt6b;

/**
 * Diese Klasse erzeugt Instanzen der Klasse Befehl.
 * 
 * Kann keine Instanz der Klasse Befehl erzeugt werden, so reagiert die Klasse mit einer entsprechenden Fehlermeldung.
 * 
 * Besteht ein Befehl nur aus seinem Schl�sselwort, so ist der Zusatz des Befehls 'null'.
 */
public class BefehlFactory {
	/**
	 * Erstellt eine neue Instanz eines Befehls auf Basis einer Benutzereingabe.
	 * @param input	Die Benutzereingabe.
	 * @return		Der erstellte Befehl.
	 * @throws BefehlUnbekanntException	Wird geworfen, wenn keine Instanz eines Befehls erzeugt werden kann. Gr�nde k�nnen sein:
	 * 									- Kein Befehl eingegeben.
	 * 									- Unbekannter Befehl eingegeben.
	 * 									- Unbekannte oder nicht eingegebene Richtung beim Befehl "go".
	 */
	public static Befehl createBefehl(String input) throws BefehlUnbekanntException {
		// Abbruch bei fehlender Eingabe.
        if(input == null || input.trim().equals("")) {
            throw new BefehlUnbekanntException("Du hast keinen Befehl eingegeben.");
        }
        // Befehl aufsplitten in die einzelnen Befehlsteile
		String[] befehlArray = input.trim().split(" ");
        // Auswerten des Befehlsworts
        Befehl befehl = null;
        String befehlWort = befehlArray[0].trim().toLowerCase();
        switch (befehlWort) {
			case "go":
	        	if (befehlArray.length >= 2) {
		        	String richtung = befehlArray[1].trim().toLowerCase();
		        	// Pr�fen der angegebenen Richtung per Schleife �ber Enum aller Richtungen
		        	for (Richtungen r : Richtungen.values()) {
						if (r.name().equalsIgnoreCase(richtung)) {
							befehl = new Befehl(befehlWort, richtung);
							break;
						}
		        	}
		        	if (befehl == null) {
		        		throw new BefehlUnbekanntException("Gib eine korrekte Richtung an.");
		        	}
	        	}
	        	else {
	        		throw new BefehlUnbekanntException("Erg�nze deinen Befehl um die Richtung, in die du dich bewegen m�chtest.");
	        	}
				break;
			case "help":
	        	befehl = new Befehl("help", null);
				break;
			case "quit":
	        	befehl = new Befehl("quit", null);
				break;
			default:
        		throw new BefehlUnbekanntException("Ich wei� nicht, was du meinst ...");
		}
		return befehl;
	}
	
}
