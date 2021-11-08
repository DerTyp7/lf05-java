package zahlenraten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zahlenraten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Zahl:");
        String zahl_input = br.readLine();
        int zahl = Integer.parseInt(zahl_input);


        //fragen
        System.out.println("Ist die Zahl 50?");
        if(zahl == 50){
            System.out.println("Found");
            return;
        }

        System.out.println("Ist die Zahl kleiner als 50?");
        if(zahl < 50){
            System.out.println("ist die Zahl 25?");
            if(zahl == 25){
                System.out.println("Found");
                return;
            }

            System.out.println("Ist die Zahl kleiner 25?");
            if(zahl < 25){

            }

            System.out.println("Ist die Zahl größer 25?");
            if(zahl > 25){

            }
        }
        System.out.println("Ist die Zahl größer als 50?");
        if(zahl > 50){
            System.out.println("ist die Zahl 75?");
            if(zahl == 75){
                System.out.println("Found");
                return;
            }

            System.out.println("Ist die Zahl kleiner 75?");
            if(zahl < 75){

            }

            System.out.println("Ist die Zahl größer 75?");
            if(zahl > 75){

            }
        }



    }
}
