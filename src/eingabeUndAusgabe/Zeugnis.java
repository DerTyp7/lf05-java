package eingabeUndAusgabe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zeugnis {
    public static void main(String[] args) throws IOException {
        int note = 0;
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your grade (0 - end):");

        String current_note_input = br.readLine();
        int current_note = Integer.parseInt(current_note_input);

        while(current_note != 0){
            note += current_note;
            current_note_input = br.readLine();
            current_note = Integer.parseInt(current_note_input);
            count += 1;
        }

        System.out.println("Durchschnitt");
        System.out.println(note/count);

    }
}
