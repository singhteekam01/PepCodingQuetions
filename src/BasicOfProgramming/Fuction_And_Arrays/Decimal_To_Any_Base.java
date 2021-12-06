package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;

// 1. You are given a decimal number n.
// 2. You are given a base b.
// 3. You are required to convert the number n into its corresponding value in base b.


public class Decimal_To_Any_Base {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b = scn.nextInt();

        int ans = decimalToAnyBase(n,b);

        System.out.println(ans);
    }

    public static int decimalToAnyBase(int n, int b){
        int res = 0;
        int multiplier =1;
        while(n > 0){
            int rem = n%b;

            res += rem*multiplier;

            n = n/b;

            multiplier *= 10;
        }
        return res;
    }
}
