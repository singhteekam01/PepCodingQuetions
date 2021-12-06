package BasicOfProgramming.Getting_Started;

import java.util.Scanner;

public class Inverse_Of_A_Number {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int res = 0;
        int idx =1;
        while(n >0){
            int firstDigit = n%10;
            n /= 10;
            res +=idx*power(10,firstDigit);
            idx++;
        }
        System.out.println(res);
    }
    public static int power(int base, int num){
        int ans = 1;
        while(num-1 >0){
            ans *= base;
            num--;
        }
        return ans;
    }
}
