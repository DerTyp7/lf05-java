package eindimensionaleArrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Maxima {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Vars
        double[] nums = new double[4];
        double biggest;
        double secondBiggest;

        nums[0] = 2.3;
        nums[1] = 8.2;
        nums[2] = 3.9;
        nums[3] = 6.4;

        biggest = nums[0];
        secondBiggest = nums[0];
        for(int c = 0; c < nums.length; c++){
            if (nums[c] > biggest)
            {
                biggest = nums[c];
            }else if(nums[c] > secondBiggest){
                secondBiggest = nums[c];
            }


        }
        System.out.println(biggest);
        System.out.println(secondBiggest);
    }
}
