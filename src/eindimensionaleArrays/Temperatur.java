package eindimensionaleArrays;

public class Temperatur {
    public static void main(String[] args)  {

        //Vars
        double mittelwert = 0;
        double maxTemp;
        double minTemp;
        double differenz = 0;
        double tempDifferenz = 0;

        double[] nums = new double[4];
        nums[0] = 19.3;
        nums[1] = 5.3;
        nums[2] = 10.3;
        nums[3] = 22.4;


        maxTemp = nums[0];
        minTemp = nums[0];;

        for(int c = 0; c < nums.length; c++){
            mittelwert += nums[c];

            if (nums[c] > maxTemp)
            {
                maxTemp = nums[c];
            }

            if (nums[c] < minTemp)
            {
                minTemp = nums[c];
            }



            try{
                if(nums[c]-nums[c+1] < 0)
                {
                    tempDifferenz = (nums[c]-nums[c+1])*-1;
                }else{
                    tempDifferenz = nums[c]-nums[c+1];
                }

                if (tempDifferenz > differenz)
                {
                    differenz = tempDifferenz;
                }
            }catch (Exception e){

            }


        }


        mittelwert = mittelwert/(nums.length)+1;
        System.out.println("mittelwert:" + mittelwert);
        System.out.println("differenz:" + differenz);
        System.out.println("max:" + maxTemp);
        System.out.println("min:" + minTemp);
        System.out.println("spannweite:" + (maxTemp-minTemp));
    }
}
