package RecursionAndBacktracking.IntroductionToRecursion;

import java.util.Scanner;

public class Print_Decreasing {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        PD(n);

    }

    public static void PD(int n){

        if(n == 0) return;

        System.out.println(n);
        PD(n-1);

    }


}
