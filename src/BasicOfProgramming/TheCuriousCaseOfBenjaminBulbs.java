package BasicOfProgramming;

import java.util.Scanner;

public class TheCuriousCaseOfBenjaminBulbs {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        //if we observe wisely we note that after n fluctuation perfect square-root
        //numberth bulbs are swicthed on

        for (int i = 1; i * i <= n; i++) {
            int sq = i * i;
            if (sq <= n) {
                System.out.println(sq);
            }
        }

    }

}
