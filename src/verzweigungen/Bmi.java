package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bmi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dein Gewicht:");
        String gewicht_input = br.readLine();
        int gewicht = Integer.parseInt(gewicht_input);

        System.out.println("Deine Größe:");
        String height_input = br.readLine();
        int height = Integer.parseInt(height_input);

        double bmi = (height*2) / gewicht;

        System.out.println(bmi);
    }
}
