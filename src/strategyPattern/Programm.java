package strategyPattern;

public class Programm {
    public static void main(String[] args) {
        Programm programm = new Programm();
        programm.doWork();
    }

    public void doWork(){
        System.out.println("Doing work");
        ISortieralgorithmus sortieralgorithmus = new Bubblesort();
        long start = System.nanoTime();
        double[] result = sortieralgorithmus.sortiereAbsteigend(new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0});

        long end = System.nanoTime();
        long duration = (end - start);
        System.out.println("Duration: " + duration / 1000 + " microseconds");

        for (double d : result) {
            System.out.println(d);
        }
    }
}
