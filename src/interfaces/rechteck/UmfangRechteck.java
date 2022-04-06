package interfaces.rechteck;

public class UmfangRechteck implements IRechnen{
    @Override
    public double berechne(double zahl1, double zahl2) {
        return (zahl1*2 + zahl2*2);
    }
}
