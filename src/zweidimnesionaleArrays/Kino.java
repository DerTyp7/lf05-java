package zweidimnesionaleArrays;

public class Kino {
    public static String[][] erzeugeSaal(){
        int sitzeProReihe = 10;
        int anzahlReihen = 5;
        String[][] saal = new String[anzahlReihen][sitzeProReihe];

        for(int i = 0; i < anzahlReihen; i++){
            for(int a = 0; a < sitzeProReihe; a++){
                saal[i][a] = "O";
            }
        }

        return saal;
    }

    public static void anzeigeSaal(String[][] saal){
        for(int i = 0; i < saal.length; i++){
            for(int a = 0; a < saal.length; a++){
                System.out.print(saal[i][a] + " ");
            }
            System.out.print("\n");
        }
    }

    public static String[][] reservierePlatz(String[][] saal, int reihe, int platz){
        saal[reihe-1][platz-1] = "X";

        return saal;
    }

    public static String[][]stonierePlatz(String[][] saal, int reihe, int platz){
        saal[reihe-1][platz-1] = "O";

        return saal;
    }


    public static void main(String[] args) {
        String[][] saal = erzeugeSaal();

        saal = reservierePlatz(saal, 2,2);
        saal = reservierePlatz(saal, 1,2);
        saal = reservierePlatz(saal, 3,3);

        saal = stonierePlatz(saal, 2,2);
        anzeigeSaal(saal);

    }
}
