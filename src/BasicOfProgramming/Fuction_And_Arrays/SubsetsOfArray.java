package BasicOfProgramming.Fuction_And_Arrays;

import java.util.Scanner;

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to print all subsets of arr. Each subset should be
// on separate line. For more clarity check out sample input and output.


public class SubsetsOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int total_subsets = (int)Math.pow(2,n);

        for(int i=0; i<total_subsets; i++){
            int temp = decimalToAnyBase(i,2);

            int power =(int)Math.pow(10,n-1);
            for(int j=0; j<n; j++){
                int rem = temp/power;
                temp %= power;
                if(rem == 0){
                    System.out.print("-\t");
                }else{
                    System.out.print(arr[j]+"\t");
                }
                power /= 10;
            }
            System.out.println();

        }
    }
    public static int decimalToAnyBase(int n,int b){
        int res = 0;
        int multiplier =1;

        while(n > 0){
            int rem = n%b;
            n /= b;

            res += rem*multiplier;

            multiplier *= 10;
        }
        return  res;
    }
}
