package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

public class Print_Increasing_Decreasing {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        PID(n);
    }
    public static void PID(int n ){

        if(n == 0) return;

        System.out.println(n);
        PID(n-1);
        System.out.println(n);
    }
}
