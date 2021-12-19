package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

public class Power_Linear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        System.out.println(power(x,n));
    }
    public static int power(int x,int n){

        if(n == 0) return 1;

        int pnm1 = power(x,n-1);

        return pnm1*x;
    }
}
