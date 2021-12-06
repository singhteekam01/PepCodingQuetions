package BasicOfProgramming.Getting_Started;

import java.util.Scanner;

public class Fibonacci_Till_N {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int a =0;
        int b =1;

        for(int i =0; i<n; i++){
            int c = a+b;
            System.out.println(a);
            a = b;
            b = c;
        }
    }
}
