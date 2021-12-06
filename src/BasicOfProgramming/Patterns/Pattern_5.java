package BasicOfProgramming.Patterns;

import java.util.Scanner;

public class Pattern_5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        int k = n/2 + 1;
        for(int i =1; i<=k; i++){
            for(int j =1; j<=k-i; j++){
                System.out.print("\t");
            }
            for(int j =1; j<=2*i-1; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

        for(int i =1; i<=n/2; i++){
            for(int j =1; j<=i ; j++){
                System.out.print("\t");
            }
            for(int j =1; j<n-2*i+1; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }

    }

}
