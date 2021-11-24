package BasicOfProgramming;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int k = scn.nextInt();

        int nod =0;
        int temp =n;
        while(temp > 0){
            temp /= 10;
            nod++;
        }

        if(k<0){
            while(k <0){
                k += nod;
            }
        }
        k %= nod;

        int backDigits = n%power(10,k);
        int frontDigits = n/power(10,k);

        int ans = backDigits*power(10,nod-k)+frontDigits;
        System.out.println(ans);
    }
    public static int power(int base,int pow){
        int ans =1;
        while(pow>0){
            ans *= base;
            pow--;
        }
        return ans;
    }
}
