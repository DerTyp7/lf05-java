package interfaces.rechteck;

public class Programm {
    class UmfangIntern implements IRechnen{
        @Override
        public double berechne(double zahl1, double zahl2) {
            return (zahl1*2 + zahl2*2);
        }
    }

    private void doWork(){
        Rechteck rechteck = new Rechteck(2, 3);
        IRechnen umfang = new UmfangIntern();

        double ergebnis = rechteck.berechne(umfang);
    }

    public static void main(String[] args) {
        new Programm().doWork();

    }
}
