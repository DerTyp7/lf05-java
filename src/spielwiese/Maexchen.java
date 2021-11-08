package spielwiese;

public class Maexchen {
    public static void main(String[] args) {
        double zahl1;
        double zahl2;
        int points = 0;

        zahl1 = Math.floor((Math.random() * ((6 - 1) + 1)) + 1);
        zahl2 = Math.floor((Math.random() * ((6 - 1) + 1)) + 1);

        if((zahl1 == 1 && zahl2 == 2) || (zahl1 == 2 && zahl2 == 1)){
            System.out.println("Mäxchen");
            points += 1000;
        }else if(zahl1 < zahl2){
            points += zahl2*10;
        }else if(zahl1 > zahl2){
            points += zahl1*10;
        }

        if(zahl1 == zahl2){
            points += 100;
        }
        System.out.println(points);

    }
}
