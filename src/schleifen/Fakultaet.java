package schleifen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fakultaet {
    public static void main(String[] args) {

        int ganzZahl = 120;
        int result = 1;
        int i = 1;
        while (result != ganzZahl){
            result = result * i;
            System.out.println(result);
            i++;
        }
    }
}
