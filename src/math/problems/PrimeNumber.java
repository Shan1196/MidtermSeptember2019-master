package math.problems;
import java.util.ArrayList;
public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        System.out.println ( findPrimes( 1000000 , 2000000));

    }
    public  static ArrayList<Integer> findPrimes(int start,int end){
        ArrayList<Integer> primes = new ArrayList< Integer> ();
        for (int x = start; x < end; x++){
            boolean prime = true;

            int i = 2 ;
            while (i <= x/2){
                if (x % i== 0){
                    prime = false;
                    break;
                }
                i++;
            }
            if ( prime){
                primes.add ( x );
            }

        }
        return  primes ;

    }
}

