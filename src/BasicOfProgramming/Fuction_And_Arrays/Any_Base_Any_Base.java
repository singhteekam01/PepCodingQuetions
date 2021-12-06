package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;

// 1. You are given a number n.
// 2. You are given a base b1. n is a number on base b.
// 3. You are given another base b2.
// 4. You are required to convert the number n of base b1 to a number in base b2.

public class Any_Base_Any_Base {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int n1 = anyBaseToDecimal(n,b1);
        int ans = decimalToAnyBase(n1,b2);

        System.out.println(ans);

    }

    private static int decimalToAnyBase(int n, int b) {

        int res = 0;
        int multiplier =1;

        while(n > 0){
            int rem = n%b;

            res += rem*multiplier;

            n  /= b;

            multiplier *= 10;
        }
        return res;
    }

    private static int anyBaseToDecimal(int n, int b) {

        int res = 0;
        int multiplier = 1;

        while(n > 0){
            int rem = n%10;

            res += rem*multiplier;

            n = n/10;

            multiplier *= b;
        }
        return res;
    }
}
