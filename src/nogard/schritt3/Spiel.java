package nogard.schritt3;

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
 *  - Sie legt alle Bereiche an. Anschlieﬂend startet das Spiel. 
 *  - Sie wertet die Befehle aus und sorgt f¸r ihre Ausf¸hrung.
 */
public class Spiel {
	private Bereich aktiverBereich;

    /**
     * Die Hauptmethode zum Spielen. 
     * L‰uft bis zum Ende des Spiels in einer Schleife.
     */
    public void spielen() {
        erzeugeDorf();

        ausgebenStartText();
        aktiverBereich.getInfo();

		// Befehle einlesen und auswerten.
        Scanner scannerZeile = new Scanner(System.in);
		
        boolean end = false;
        while (! end) {
            // Eingabeaufforderung anzeigen.
            System.out.print("> ");
            // Befehlszeile lesen.
            String input = scannerZeile.nextLine();
            // Befehl interpretieren.
            String[] befehl = input.trim().split(" ");
            // Abbruch bei fehlender Eingabe.
            if(befehl.length == 0) {
        		System.out.println("Ich weiﬂ nicht, was Du meinst ...");
                end = false;
            }
            else {
	            // Auswerten des Befehls.
	            String befehlWort = befehl[0].trim();
	            if (befehlWort.equalsIgnoreCase("go")) {
                    wechselBereich(befehl);
                    end = false;
	            }
	            else if (befehlWort.equalsIgnoreCase("help")) {
                    ausgebenHilfeText();
                    end = false;
	            }
	            else if (befehlWort.equalsIgnoreCase("quit")) {
	            	end = true;
	            }
	            else {
	        		System.out.println("Ich weiﬂ nicht, was Du meinst ...");
	                end = false;
	            }
            }
        }
        ausgebenEndText();

    }

    private void wechselBereich(String[] befehl) {
        if (befehl.length < 2) {
        System.out.println("Wohin mˆchtest Du gehen?");
        }
        else {
            String richtung = befehl[1].trim();
            Bereich neuerBereich;
            if(richtung.equalsIgnoreCase("north")) {
                neuerBereich = aktiverBereich.getNord();
            }
            else if(richtung.equalsIgnoreCase("east")) {
                neuerBereich = aktiverBereich.getOst();
            }
            else if(richtung.equalsIgnoreCase("south")) {
                neuerBereich = aktiverBereich.getSued();
            }
            else if(richtung.equalsIgnoreCase("west")) {
                neuerBereich = aktiverBereich.getWest();
            }
            else {
                neuerBereich = null;
            }
            // Auswertung der gefundenen Bereichs.
            if (neuerBereich == null) {
                System.out.println("Dort geht es nicht weiter.");
            }
            else {
                aktiverBereich = neuerBereich;
                aktiverBereich.getInfo();
            }
        }
    }


    private void ausgebenHilfeText() {
        System.out.println("Du irrst in Nogard herum.");
        System.out.println("Dir stehen folgende Befehle zur Verf¸gung:");
        System.out.println("\tgo");
        System.out.println("\tquit");
        System.out.println("\thelp");
    }

    private void erzeugeDorf() {
        // Die Bereiche erzeugen.
        Bereich friedhof = new Bereich("auf einem Friedhof, umgeben von dunklen Tannen");
        Bereich wald = new Bereich("im dunklen Stadtwald von Nogard");
        Bereich taverne = new Bereich("in der Taverne, mit zwielichtigen Gestalten an der Theke");
        Bereich hexenhaus = new Bereich("im finsteren Hexenhaus");
        Bereich rathaus = new Bereich("im Rathaus von Nogard");

        // Die Nachbarschaften festlegen.
        friedhof.setNachbarn(null, null, hexenhaus, null);
        wald.setNachbarn(hexenhaus, taverne, null, null);
        taverne.setNachbarn(rathaus, null, null, wald);
        hexenhaus.setNachbarn(friedhof, rathaus, null, null);
        rathaus.setNachbarn(null, null, taverne, hexenhaus);

        // Das Spielt startet im Wald.
        aktiverBereich = wald;
    }

    private void ausgebenEndText() {
        // Endbildschirm ausgeben.
        System.out.println("Danke f¸r dieses Spiel. Auf Wiedersehen.");
    }

    private void ausgebenStartText() {
        // Begr¸ﬂungsbildschirm ausgeben.
        System.out.println("Willkommen in Nogard!");
        System.out.println("Entdecke die Welt von Nogard. Doch Vorsicht, ¸berall lauern Gefahren!");
        System.out.println("Wenn du Hilfe benˆtigst, tippe 'help'.");
        System.out.println();
    }
}
