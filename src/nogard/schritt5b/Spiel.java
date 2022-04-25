package  nogard.schritt5b;

import java.util.Scanner;

/**
 *  Dies ist die Hauptklasse der Anwendung "Die Welt von Nogard".
 *  
 *  "Die Welt von Nogard" ist ein sehr einfaches, textbasiertes Adventure-Game, in dem sich ein Spieler durch Nogard bewegen kann. 
 *  
 *  Das Spiel sollte auf jeden Fall ausgebaut werden, damit es interessanter wird!
 * 
 *  Zum Spielen muss an einer Instanz dieser Klasse die Methode "spielen()" aufgerufen werden.
 * 
 *  Diese Klasse erzeugt und initialisiert alle Objekte der Anwendung: 
 *  - Sie legt alle Bereiche an. Anschlie�end startet das Spiel. 
 *  - Sie wertet die Befehle aus und sorgt f�r ihre Ausf�hrung.
 */
public class Spiel {
	private Bereich aktiverBereich;

	public Spiel() {
		erzeugeDorf();
	}
    /**
     * Die Hauptmethode zum Spielen. 
     * L�uft bis zum Ende des Spiels in einer Schleife.
     */
    public void spielen() {
		ausgebenStartText();

		// Befehle einlesen und auswerten.
        Scanner scannerZeile = new Scanner(System.in);

		boolean end = false;
        while (! end) {
            // Eingabeaufforderung anzeigen.
            System.out.print("> ");
			String input = scannerZeile.nextLine();
			try {
				Befehl befehl = BefehlFactory.createBefehl(input);
				end = ausfuehrenBefehl(befehl);
			} catch (BefehlUnbekanntException e) {
				System.out.println(e.getMessage());
			}
		}
        
        // Endbildschirm ausgeben.
		ausgebenEndText();
	}

	private boolean ausfuehrenBefehl(Befehl befehl) {
		boolean end = false;
		switch (befehl.getWort()) {
			case "go" -> wechselBereich(befehl);
			case "help" -> ausgebenHilfeText();
			case "quit" -> end = true;
			default -> ausgebenFehlerBefehl();
		}
		return end;
	}

	private void wechselBereich(Befehl befehl) {
		Richtungen richtung = Richtungen.valueOf(befehl.getZusatz().toUpperCase());
		Bereich neuerBereich = aktiverBereich.getNachbar(richtung);

		if (neuerBereich == null) {
			System.out.println("Hier geht es nicht weiter");
		} else {
			aktiverBereich = neuerBereich;
		}
		System.out.println(aktiverBereich.getInfo());
	}

	private void ausgebenHilfeText() {
		System.out.println("Du irrst in Nogard herum.");
		System.out.println("Dir stehen folgende Befehle zur Verf�gung:");
		System.out.println("\tgo");
		System.out.println("\tquit");
		System.out.println("\thelp");
	}

	private void ausgebenEndText() {
		System.out.println("Danke f�r dieses Spiel. Auf Wiedersehen.");
	}

	private void ausgebenStartText() {
		// Begr��ungsbildschirm ausgeben.
		System.out.println("Willkommen in Nogard!");
		System.out.println("Entdecke die Welt von Nogard. Doch Vorsicht, �berall lauern Gefahren!");
		System.out.println("Wenn du Hilfe ben�tigst, tippe 'help'.");
		System.out.println();
		System.out.println(aktiverBereich.getInfo());
	}

	private void erzeugeDorf() {
		// Die Bereiche erzeugen.
		Bereich friedhof = new Bereich("auf einem Friedhof, umgeben von dunklen Tannen");
		Bereich wald = new Bereich("im dunklen Stadtwald von Nogard");
		Bereich taverne = new Bereich("in der Taverne, mit zwielichtigen Gestalten an der Theke");
		Bereich hexenhaus = new Bereich("im finsteren Hexenhaus");
		Bereich rathaus = new Bereich("im Rathaus von Nogard");
		Bereich weinkeller = new Bereich("Weinkeller der Taverne");

		// Die Nachbarschaften festlegen.
		taverne.setNachbar(Richtungen.NORTH, rathaus);
		taverne.setNachbar(Richtungen.WEST, wald);
		taverne.setNachbar(Richtungen.DOWN, weinkeller);
		weinkeller.setNachbar(Richtungen.UP, taverne);
		wald.setNachbar(Richtungen.NORTH, friedhof);
		friedhof.setNachbar(Richtungen.SOUTH, wald);
		friedhof.setNachbar(Richtungen.EAST, hexenhaus);
		hexenhaus.setNachbar(Richtungen.WEST, friedhof);

		// Das Spielt startet im Wald.
		aktiverBereich = wald;
	}

	private void ausgebenFehlerBefehl() {
		System.out.println("Ich wei� nicht, was Du meinst ...");
	}

}
