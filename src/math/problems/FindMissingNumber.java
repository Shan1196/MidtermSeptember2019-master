package math.problems;

public class FindMissingNumber {
    public static void main(String[] args) {
        int missingNumber = 9;



        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int num = 10;
        int idealSum = (num * (num + 1)) / 2;//(total num*( total num + 1))/2
        int sum = calculateSum ( array );
        System.out.println (missingNumber);

    }


    private static int calculateSum(int[] array) {
        int sum= 0;
        for ( int n : array) {
            sum += n;


        }
        return sum;
    }


}




