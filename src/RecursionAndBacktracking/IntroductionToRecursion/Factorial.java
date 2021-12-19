package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        System.out.println(fact(n));
    }
    public static int fact(int n){

        if(n ==0 || n == 1){
            return n;
        }

        int factnm1 = fact(n-1);

        return n*factnm1;
    }
}
