package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Vars
        double[] nums = new double[2];
        double[] nums2 = new double[2];

        System.out.println("1. Num:");
        nums[0] = Double.parseDouble(br.readLine());
        System.out.println("2. Num:");
        nums[1] = Double.parseDouble(br.readLine());
    }
}
