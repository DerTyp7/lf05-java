package abstractClasses;

public class Motorrad extends Vehicle{


    @Override
    public void bremsen() {
        System.out.println("Bremsen");
    }

    @Override
    public void beschleunigen() {
        System.out.println("fahren");
    }
}
