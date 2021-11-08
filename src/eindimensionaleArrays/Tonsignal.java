package eindimensionaleArrays;

public class Tonsignal {
    public static void main(String[] args) {
        //1,5,4,5,7,6,8,6,5,4,5,4
        int[] first = new int[12];
        first[0] = 1;
        first[1] = 5;
        first[2] = 4;
        first[3] = 5;
        first[4] = 7;
        first[5] = 6;
        first[6] = 8;
        first[7] = 6;
        first[8] = 5;
        first[9] = 4;
        first[10] = 5;
        first[11] = 4;



        for(int c = 0; c < first.length; c++) {
            if (c == 0) {
                first[c] = (first[c + 1] + first[c + 2]) / 2;
            } else if (c == first.length - 1) {
                first[c] = (first[c - 1] + first[c - 2]) / 2;
            } else {
                first[c] = (first[c - 1] + first[c + 1]) / 2;
            }


            System.out.print(first[c] + " ");
        }
    }
}
