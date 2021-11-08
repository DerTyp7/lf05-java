package schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadrat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Anzahl:");

        String anzahlStr = br.readLine();
        int anzahl = Integer.parseInt(anzahlStr);

        int i = 0;
        int c = 0;
        String result = "";

        while(i <= anzahl*anzahl){
            c = 0;
            if(i == 0){
                while(c <= anzahl ){
                    result += "*";
                    c++;
                }
            }else{
                result += "\n*";
                while(c-2 <= anzahl ){
                    result += " ";
                    c++;
                }
                result += "*\n";
            }

            if(i == anzahl){
                result += "";
            }
            i++;
        }
        System.out.print(result);

    }
}
