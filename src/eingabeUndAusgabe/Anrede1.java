package eingabeUndAusgabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");

        String text = br.readLine();


        System.out.println("Wie wollen sie angesprochen werden (1 = Mann, 2 = Frau oder Benutzerdefinierte Anrede)?");
        String anrede = br.readLine();

        switch (anrede){
            case "1":
                System.out.println("Herr " + text);
                break;
            case "2":
                System.out.println("Frau " + text);
                break;
            default:
                System.out.println(anrede + " " + text);
                break;

        }
    }
}
