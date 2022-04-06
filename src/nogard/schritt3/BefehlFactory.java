package nogard.schritt3;

public class BefehlFactory {
    public static Befehl createBefehl(String eingabe) throws BefehlUnbekanntException {

        if(eingabe.length() > 0){
            String[] befehl = eingabe.trim().split(" ");
            befehl[0] = befehl[0].toLowerCase();

            if(befehl.length > 1){
                befehl[1] = befehl[1].toLowerCase();
            }



            switch (befehl[0]){
                case "go": return goBefehl(befehl);
                case "help": return helpBefehl(befehl);
                case "quit": return quitBefehl(befehl);
                default: throw new BefehlUnbekanntException();
            }

        }else{
            throw new BefehlUnbekanntException();
        }
    }

    private static Befehl quitBefehl(String[] befehl) {
        return new Befehl(befehl[0]);
    }

    private static Befehl helpBefehl(String[] befehl) {
        return new Befehl(befehl[0]);
    }

    private static Befehl goBefehl(String[] befehl) {
        return new Befehl(befehl[0], befehl[1]);
    }
}
