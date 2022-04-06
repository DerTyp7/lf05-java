package interfaces.rechteck;

public class FlaecheRechteck implements IRechnen {
    @Override
    public double berechne(double zahl1, double zahl2) {
        return (zahl1*zahl2);
    }
}
