package BasicOfProgramming.Fuction_And_Arrays;
import java.util.Scanner;

// 1. You are given a number n.
// 2. You are given a base b. n is a number on base b.
// 3. You are required to convert the number n into its corresponding value in decimal number system.

public class Any_Base_To_Decimal {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
        int b =scn.nextInt();

        int ans = anyBaseToDecimal(n,b);
        System.out.println(ans);
    }
    public static int anyBaseToDecimal(int n, int b){
        int res =0;
        int multiplier =1;

        while(n >0){
            int rem = n%10;

            res += rem*multiplier;

            n /= 10;

            multiplier *= b;
        }
        return res;
    }
}

