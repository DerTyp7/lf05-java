package eingabeUndAusgabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Rechner {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Zahl1:");

        String textZahl1 = br.readLine();

        System.out.println("Zahl2:");
        String textZahl2 = br.readLine();
        double zahl1 = Double.parseDouble(textZahl1.trim().replace(',','.'));
        double zahl2 = Double.parseDouble(textZahl2.trim().replace(',','.'));

        System.out.println("Wähle einen Operator (/, *, +, -, 2):");
        String operator = br.readLine();
        switch(operator){
            case "/":
                System.out.println(zahl1/zahl2);
                break;
            case "*":
                System.out.println(zahl1*zahl2);
                break;
            case "+":
                System.out.println(zahl1+zahl2);
                break;
            case "-":
                System.out.println(zahl1-zahl2);
                break;
            case "2":
                System.out.println(Math.pow(zahl1, zahl2));
                break;
        }

        

    }
}
