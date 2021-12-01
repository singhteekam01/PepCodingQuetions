package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;


// 1. You are given a number n.
// 2. You are given a digit d.
// 3. You are required to calculate the frequency of digit d in number n.


public class DigitFrequency {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int d = scn.nextInt();

        int ans = digiFreq(n,d);

        System.out.println(ans);

    }
    public static int digiFreq(int n,int d){
        int count =0;
        while(n>0){
            int rem = n%10;
            if(rem == d){
                count++;
            }
            n  /= 10;
        }
        return count;
    }
}
