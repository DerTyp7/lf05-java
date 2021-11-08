package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Voting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Vars
        double[] nums = new double[4];

        System.out.println("1. Num:");
        nums[0] = Double.parseDouble(br.readLine());

        System.out.println("2. Num:");
        nums[1] = Double.parseDouble(br.readLine());

        System.out.println("3. Num:");
        nums[2] = Double.parseDouble(br.readLine());

        System.out.println("4. Num:");
        nums[3] = Double.parseDouble(br.readLine());

        for(int c = 0; c < nums.length; c++){
            System.out.print((c+1) + ": ");
            while (nums[c] >= 1){
                System.out.print("*");
                nums[c] -= 1;
            }
            System.out.println("\n");
        }



    }
}
