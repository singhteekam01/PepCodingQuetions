package BasicOfProgramming.Fuction_And_Arrays;
import java.awt.*;
import java.util.Scanner;

// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to multiply n1 and n2 and print the value.

public class AnyBaseMultiplication {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int ans = getProduct(n1,n2,b);

        System.out.println(ans);

    }
    public static int getProduct(int n1,int n2,int b){
        int res =0;
        int multiplier = 1;

        while(n1 > 0){
            int carry =0;
            int resTemp =0;
            int tempPower =1;

            int d = n1 % 10;
            int tempN2 = n2;

            while (tempN2 > 0 || carry != 0){
                int d2 = tempN2%10;

                resTemp += ((d*d2+carry)%b)*tempPower;

                carry = (d*d2 + carry)/b;

                tempN2   /= 10;

                tempPower *= 10;

            }

            res = addition(res,resTemp*multiplier,b);

            n1  /= 10;

            multiplier *= 10;

        }
        return res;
    }
    public static int addition(int n1, int n2, int b){
        int res = 0;
        int carry = 0;
        int multiplier =1;

        while(n1 > 0 || n2 > 0 || carry !=0){
            int d1 = n1%10;
            int d2 = n2%10;

            res += ((d1+d2+carry)%b)*multiplier;

            carry = (d1+d2+carry)/b;

            n1  /= 10;
            n2  /= 10;

            multiplier *= 10;
        }
        return res;
    }
}
