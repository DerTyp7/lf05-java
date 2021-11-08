package eindimensionaleArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Verdoppeln {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Vars
        int arrayLen;
        int sumUngerade = 0;
        int sumGerade = 0;

        System.out.println("Wie lang array:");
        arrayLen = Integer.parseInt(br.readLine());
        double[] nums = new double[arrayLen];

        for(int c = 0; c < nums.length; c++){
            System.out.println("Nummer :");
            nums[c] = Double.parseDouble(br.readLine());

            if((nums[c] % 2) < 1){
                sumGerade++;
            }else{
                sumUngerade++;
            }
        }

        System.out.println("Gerade:" + sumGerade);
        System.out.println("Ungerade:" + sumUngerade);

    }
}
