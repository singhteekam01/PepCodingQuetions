package BasicOfProgramming.Getting_Started;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (b > a && b > c) {
            int temp = b;
            b = a;
            b = temp;
        } else if (c > a && c > b) {
            int temp = c;
            c = a;
            a = temp;
        }

        if (a * a == (b * b + c * c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
