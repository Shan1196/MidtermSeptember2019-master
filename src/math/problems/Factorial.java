package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println (factorial ( 5 ));
    }
    public  static  int  factorial(int number){
        if ( number == 1){
            System.out.println ("factorial ("+ number + ") 1");
            return 1;
        } else {
            System.out.println ("factorial("+ number +") = " + number +" * factorial(" + (number -1)+")");
            return number *factorial ( number - 1 );
        }



    }
}
