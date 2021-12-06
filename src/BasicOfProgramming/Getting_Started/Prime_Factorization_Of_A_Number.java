package BasicOfProgramming.Getting_Started;

import java.util.Scanner;

public class Prime_Factorization_Of_A_Number {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i=2; i<=n; i++){
            while(n%i == 0){
                System.out.print(i+" ");
                n /= i;
            }
        }
    }
}
