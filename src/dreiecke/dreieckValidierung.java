package dreiecke;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dreieckValidierung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Größte Seite:");
        String gr_seite_input = br.readLine();
        double gr_seite = Double.parseDouble(gr_seite_input);

        System.out.println("2. Seite:");
        String seite2_input = br.readLine();
        double seite2 = Double.parseDouble(seite2_input);

        System.out.println("3. Seite:");
        String seite3_input = br.readLine();
        double seite3 = Double.parseDouble(seite3_input);

        //Validate
        if (gr_seite >= seite2+seite3){
            System.out.println("Größte Seite zu lang");
            return;
        }else if (seite2 >= gr_seite+seite3){
            System.out.println("2. Seite zu lang");
            return;
        }else if (seite3 >= gr_seite+seite2){
            System.out.println("3. Seite zu lang");
            return;
        }

        //höhe
        double s = (seite2 + seite3 + gr_seite)*0.5;
        System.out.println(s);
        double h = (2.0 / gr_seite) * Math.sqrt(s*(s-seite2) * (s-seite3) * (s - gr_seite));
        System.out.println(h);
        double flaeche = h * gr_seite * 0.5;
        System.out.println(flaeche);




    }
}
