package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

public class Print_Increasing {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        PI(n);
    }
    public static void PI(int n){

        if (n == 0){
            return;
        }

        PI(n-1);
        System.out.println(n);
    }
}
