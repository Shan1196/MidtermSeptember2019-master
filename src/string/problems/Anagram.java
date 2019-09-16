package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String string1 = "CAT";
        String string2 = "ACT";


        System.out.println ("chek both are anagram or not: " + anagramCheck ( string1,string1 ));

    }
    public static  boolean anagramCheck(String string1, String string2){
        char[]charArrayFromString1 = string1.toCharArray ();
        char[]charArrayFromString2 = string2.toCharArray ();
        Arrays.sort ( charArrayFromString1 );
        Arrays.sort ( charArrayFromString2 );

        return Arrays.equals (charArrayFromString1, charArrayFromString2  );



    }
}
