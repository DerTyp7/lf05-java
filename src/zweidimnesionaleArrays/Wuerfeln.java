package zweidimnesionaleArrays;

import java.io.IOException;

public class Wuerfeln {

    public static void ausgabeExperiment(){

    }

    public static void main(String[] args) throws IOException {
        int anzahlWuerfe = 10;
        int anzahlExperimente = 4;
        int[][] wuerfe = new int[anzahlExperimente][anzahlWuerfe];

        for(int i = 0; i < anzahlExperimente; i++){
            for(int a = 0; a < anzahlWuerfe; a++){
                wuerfe[i][a] = (int)(Math.random()*6)+1;
            }
        }


        for(int i = 0; i < anzahlExperimente; i++){
            for(int a = 0; a < anzahlWuerfe; a++){
                System.out.print(wuerfe[i][a] +" ");
            }
            System.out.print("\n");
        }

    }
}
