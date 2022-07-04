package kaufvertrag;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class Programm {
    public static void main(String[] args) throws FileNotFoundException {
        Vertragspartner kaeufer = new Vertragspartner("Julius", "Ewert");
        Vertragspartner verkaeufer = new Vertragspartner("Noah", "Thiering");
        Ware w = new Ware("Stock", 10000.2);
        Kaufvertrag k = new Kaufvertrag(kaeufer, verkaeufer, w);
        System.out.println(k.toString());
        String datei = "src/kaufvertrag/Vertrag.csv";
        PrintWriter writer = new PrintWriter(datei);
        writer.println(k.toString());
        writer.close();

        readCSV();
    }

    public static void readCSV() throws FileNotFoundException {
        String datei = "src/kaufvertrag/Vertrag.csv";
        BufferedReader reader = new BufferedReader(new FileReader(datei));

        String zeile;
        try {
            while ((zeile = reader.readLine()) != null) {
                System.out.println(zeile);

            }
        } catch (Exception e) {
            System.out.println("Fehler beim Lesen der Datei");
        }

        try {
            reader.close();
        } catch (Exception e) {
            System.out.println("Fehler beim Schließen der Datei");
        }
    }
}
