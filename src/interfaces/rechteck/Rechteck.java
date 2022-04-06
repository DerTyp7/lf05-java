package interfaces.rechteck;

public class Rechteck{
    private double seiteA;
    private double seiteB;

    public Rechteck(double seiteA, double seiteB) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    public void rechnen(IRechnen iRechnen){

    }

    public double getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(double seiteB) {
        this.seiteB = seiteB;
    }

    public double getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(double seiteA) {
        this.seiteA = seiteA;
    }

    public double berechne(IRechnen rechnen){
        return rechnen.berechne(this.seiteA, this.seiteB);
    }

}
