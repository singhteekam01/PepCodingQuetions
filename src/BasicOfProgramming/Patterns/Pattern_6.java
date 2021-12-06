package BasicOfProgramming.Patterns;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here

        int n= scn.nextInt();

        int k =n/2+1;
        for(int i =1; i <=k; i++){
            for(int j =1; j<=k-i+1; j++){
                System.out.print("*\t");
            }
            for(int j =1; j<=i-1; j++){
                System.out.print("\t");
            }
            System.out.print("\t");
            for(int j =1; j<=i-1; j++){
                System.out.print("\t");
            }
            for(int j =1; j<=k-i+1; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
        k = n/2;

        for(int i =1; i <=k; i++){
            for(int j =1; j<=i+1; j++){
                System.out.print("*\t");
            }
            for(int j =1; j<=k-i; j++){
                System.out.print("\t");
            }
            System.out.print("\t");
            for(int j =1; j<=k-i; j++){
                System.out.print("\t");
            }
            for(int j =1; j<=i+1; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
