package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eisenwarenhandel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mutternPreis = 3;
        int unterlegPreis = 1;
        int schraubenPreis = 5;

        System.out.println("Wie viele Unterlegscheiben?");
        String anzahlUnterlegInput = br.readLine();
        int anzahlUnterleg = Integer.parseInt(anzahlUnterlegInput);

        System.out.println("Wie viele Schrauben");
        String anzahlSchraubenInput = br.readLine();
        int anzahlSchrauben = Integer.parseInt(anzahlSchraubenInput);

        System.out.println("Wie viele Muttern?");
        String anzahlMutternInput = br.readLine();
        int anzahlMuttern = Integer.parseInt(anzahlMutternInput);

        if(anzahlMuttern != anzahlSchrauben){
            System.out.println("Anzahl Schrauben und Muttern stimmen nicht überein");
            return;
        }else{
            System.out.println("RECHNUNG");
            double schraubenPreisEnd = Double.valueOf(anzahlSchrauben*schraubenPreis)/100;
            double mutternPreisEnd = Double.valueOf(anzahlMuttern*mutternPreis)/100;
            double unterlegPreisEnd = Double.valueOf(anzahlUnterleg*unterlegPreis)/100;

            System.out.println(anzahlSchrauben + "x" + " Schrauben " + schraubenPreisEnd + "€");
            System.out.println(anzahlMuttern + "x" + " Muttern " + mutternPreisEnd + "€");
            System.out.println(anzahlUnterleg + "x" + " Unterlegscheiben " + unterlegPreisEnd + "€");

            System.out.println("-----------------");
            double gesamtPreis = schraubenPreisEnd + mutternPreisEnd + unterlegPreisEnd;
            System.out.println("Endpreis: " + gesamtPreis + "€");
        }




    }
}
