package math.problems;

public class Pattern {

    public static void main(String[] args) {
        /*
         *
         */

        int count = 0;
        for (int i = 100; i >= 0; i--) {
            count++;
            if (count <= 10) {
                System.out.println(i + " ");
            } else {
                for (i = 90; i >= 0; i -= 2) {
                    if (count > 10 && count <= 20) {
                        System.out.println(i + " ");
                        count++;
                    } else {
                        for (i = 70; i >= 0; i -= 3) {
                            if (count > 20 && count <= 30) {
                                System.out.println(i + " ");
                                count++;
                            } else {
                                for (i = 40; i >= 0; i -= 4) {
                                    if (count > 30 && count <= 40) {
                                        System.out.println(i + " ");
                                        count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

