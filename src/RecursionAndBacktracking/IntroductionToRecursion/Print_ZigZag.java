package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

public class Print_ZigZag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        printZZ(n);
    }
    public static void printZZ(int n){

        if(n == 0) return;

        System.out.print(n+" ");
        printZZ(n-1);
        System.out.print(n+" ");
        printZZ(n-1);
        System.out.print(n+" ");

    }
}
