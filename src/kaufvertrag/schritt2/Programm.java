package kaufvertrag.schritt1;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Programm {
    public static void main(String[] args) throws FileNotFoundException {
        Vertragspartner kaeufer = new Vertragspartner("Julius","Ewert");
        Vertragspartner verkaeufer = new Vertragspartner("Noah", "Thiering");
        Ware w = new Ware("Stock",10000.2);
        Kaufvertrag k = new Kaufvertrag(kaeufer,verkaeufer,w);
        System.out.println(k.toString());
        String datei = "Vertraege/Vertrag.csv";
        PrintWriter writer = new PrintWriter(datei);
        writer.println(k.toString());
        writer.close();

    }
}
