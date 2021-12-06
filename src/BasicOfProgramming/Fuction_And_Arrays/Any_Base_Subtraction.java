package BasicOfProgramming.Fuction_And_Arrays;
import java.util.*;

// 1. You are given a base b.
// 2. You are given two numbers n1 and n2 of base b.
// 3. You are required to subtract n1 from n2 and print the value.

public class Any_Base_Subtraction {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int ans = subtraction(n1,n2,b);

        System.out.println(ans);
    }
    public static int subtraction(int n1,int n2,int b){
        int res =0;
        int carry =0;
        int multiplier =1;

        while(n1 >0 || n2 > 0 || carry != 0){
            int d1 = n1%10;
            int d2 = n2%10;

            if(d2+carry < d1){
                d2 = d2 + b;
                res += (d2+carry-d1)*multiplier;
                carry = -1;
            }else{
                res += (d2+carry - d1)*multiplier;
                carry =0;
            }

            n1  /= 10;
            n2  /= 10;

            multiplier *= 10;

        }
        return res;
    }
}
