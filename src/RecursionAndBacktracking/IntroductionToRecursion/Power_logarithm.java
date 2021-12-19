package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

public class Power_logarithm {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();

        int n = scn.nextInt();

        int ans = power(x,n);

        System.out.println(ans);
    }
    public static int power(int x,int n){

        if(n == 0) return 1;

        int pnb2 = power(x,n/2);

        if(n%2 ==1){
            return pnb2*pnb2*x;
        }
        else{
            return pnb2*pnb2;
        }
    }
}
