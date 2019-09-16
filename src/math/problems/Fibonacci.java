package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n1 =0, n2 = 1, n3,  max =11;
        System.out.println (n1+ " "+n2);

        for ( int i = 2; i <= max; i++){
            n3 =n1 +n2;
            System.out.println (" " + n3 );
            n1 = n2;
            n2 = n3;

        }


    }
}