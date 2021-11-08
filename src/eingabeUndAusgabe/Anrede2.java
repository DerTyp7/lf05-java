package eingabeUndAusgabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anrede2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");

        String text = br.readLine();


        System.out.println("Wie wollen sie angesprochen werden (m = Mann, f = Frau oder Benutzerdefinierte Anrede)?");
        String anrede = br.readLine();

        switch (anrede){
            case "m":
                System.out.println("Herr " + text);
                break;
            case "f":
                System.out.println("Frau " + text);
                break;
            default:
                System.out.println(anrede + " " + text);
                break;

        }
    }
}
