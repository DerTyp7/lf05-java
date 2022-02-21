package fussball;

public class Ergebnis {
    private int tore1;
    private int tore2;


    public Ergebnis(int tore1, int tore2) {
        this.tore1 = tore1;
        this.tore2 = tore2;
    }

    public void addTor1(){
        this.tore1 += 1;
    }

    public void addTor2(){
        this.tore2 += 1;
    }

    public int getTore1() {
        return tore1;
    }

    public void setTore1(int tore1) {
        this.tore1 = tore1;
    }

    public int getTore2() {
        return tore2;
    }

    public void setTore2(int tore2) {
        this.tore2 = tore2;
    }
}
