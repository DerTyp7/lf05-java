package nogard.schritt6;

import nogard.schritt6b.*;
import nogard.schritt6b.commands.CommandFactory;
import nogard.schritt6b.commands.CommandQuit;
import nogard.schritt6b.commands.ICommand;
import nogard.schritt6b.exceptions.*;

import java.util.Scanner;

/**
 *
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
	private Spieler spieler;

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
				ICommand command = CommandFactory.createCommand(spieler, input);
				end = command instanceof CommandQuit;
				command.execute();
			} catch (BefehlUnbekanntException e) {
				System.out.println(e.getMessage());
			}
		}
        
        // Endbildschirm ausgeben.
		ausgebenEndText();
	}

	private void ausgebenEndText() {
		System.out.println("Danke für dieses Spiel. Auf Wiedersehen.");
	}

	private void ausgebenStartText() {
		// Begr��ungsbildschirm ausgeben.
		System.out.println("Willkommen in Nogard!");
		System.out.println("Entdecke die Welt von Nogard. Doch Vorsicht, überall lauern Gefahren!");
		System.out.println("Wenn du Hilfe benötigst, tippe 'help'.");
		System.out.println();
		System.out.println(spieler.getInfo());
		System.out.println(spieler.getBereich().getInfo());
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

		// Gegenstände Platzieren
		hexenhaus.platziereGegenstand(new Gegenstand("Krug", "mit fauligem Krötenwasser", 5.0));
		hexenhaus.platziereGegenstand(new Nahrung("Froschschenkel", "mit ranziger Knoblauchbutter", 700));

		// Erzeugen des Spielers
		Scanner scannerZeile = new Scanner(System.in);
		System.out.println("Spieler Erstellung\n");
		System.out.println("Name > ");
		String name = scannerZeile.nextLine();
		System.out.println("Traglast > ");
		float traglast = scannerZeile.nextFloat();
		System.out.println("Fitness > ");
		int fitness = scannerZeile.nextInt();

		spieler = new Spieler(name, traglast, fitness, hexenhaus);
	}

}
