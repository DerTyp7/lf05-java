package unit;

public class Pq1 {

    public static double[] pq(double p, double q){
        double[] result = new double[2];

        double d = Math.pow(p/2, 2) - q;

        result[0] = -(p/2) + Math.sqrt(d);
        result[1] = -(p/2) - Math.sqrt(d);

        return result;
    }

    public static void main(String[] args) {
        double[] result = pq(1, -7);

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
