package BasicOfProgramming.Patterns;

import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if(j >= i){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
}
