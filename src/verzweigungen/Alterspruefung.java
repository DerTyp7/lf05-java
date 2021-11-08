package verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alterspruefung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Dein Alter:");

        String alter_input = br.readLine();

        int alter = Integer.parseInt(alter_input);

        if(alter < 18 && alter >= 0){
            System.out.println("Du bist minderjährig");
        }else if(alter >= 18 && alter < 120){
            System.out.println("Du bist volljähring");
        }else{
            System.out.println("Sei ehrlich!");
        }
    }
}
