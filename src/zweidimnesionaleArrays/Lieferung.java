package zweidimnesionaleArrays;

import java.util.Random;

public class Lieferung {
    public static int[][] erzeugeMonat(){
        Random rand = new Random();
        int anzahlKunden = 3;
        int artikelProKunde = 4;

        int[][] monat = new int[anzahlKunden][artikelProKunde];

        for(int i = 0; i < anzahlKunden; i++){
            for(int a = 0; a < artikelProKunde; a++){
                monat[i][a] = rand.nextInt(1000);
            }
        }
        return monat;
    }

    public static void ausgabe(int[][] monat){
        for(int i = 0; i < monat.length; i++){
            for(int a = 0; a < monat[i].length; a++){
                System.out.print(monat[i][a] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static int[][] summe(int[][] monat1, int[][] monat2){
        int[][] summen = new int[monat1.length][monat1[0].length];
        for(int i = 0; i < summen.length; i++){
            for(int a = 0; a < summen[i].length; a++){
                summen[i][a] = monat1[i][a] + monat2[i][a];
            }
        }
        return summen;
    }

    public static void main(String[] args) {
        int[][] januar = erzeugeMonat();
        int[][] februar = erzeugeMonat();
        ausgabe(januar);
        ausgabe(februar);

        int[][] summe = summe(januar, februar);
        ausgabe((summe));
    }
}
