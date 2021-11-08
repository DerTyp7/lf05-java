package verzweigungen;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuehrerschein {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dein Alter:");

        String alter_input = br.readLine();

        int alter = Integer.parseInt(alter_input);

        if(alter < 14){
            System.out.println("Bobbycar");
        }else if(alter >= 14 && alter < 16){
            System.out.println("50er");
        }else if(alter >= 16 && alter < 18){
            System.out.println("125er");
        }else if(alter >= 18){
            System.out.println("auto");
        }
    }
}
