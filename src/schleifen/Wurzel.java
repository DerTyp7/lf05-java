package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wurzel {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Zahl Anfang:");
        String zahl1Str = br.readLine();
        int zahl1 = Integer.parseInt(zahl1Str);

        System.out.println("Zahl Ende:");
        String zahl2Str = br.readLine();
        int zahl2 = Integer.parseInt(zahl2Str);
        int i = zahl1;
        while(i <= zahl2){
            Double wurzelDouble = Double.valueOf(i);
            System.out.println("Zahl: " + i);
            System.out.println("Wurzel: " + Math.sqrt(wurzelDouble));
            i++;
        }

    }
}
