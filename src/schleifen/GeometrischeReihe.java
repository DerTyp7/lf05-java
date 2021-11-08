package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeometrischeReihe {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Zahl:");
        String zahlStr = br.readLine();
        int zahl = Integer.parseInt(zahlStr);
        double result = 0;
        int i = 1;
        while(i <= 11 ){

            result = result + zahl/Math.pow(2.0, i);
            System.out.println(result);
            i++;
        }
    }
}
