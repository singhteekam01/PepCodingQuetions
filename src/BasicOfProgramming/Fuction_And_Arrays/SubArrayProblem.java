package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;

// 1. You are given an array of size 'n' and n elements of the same array.
// 2. You are required to find and print all the subarrays of the given array.
// 3. Each subarray should be space seperated and on a seperate lines. Refer to sample input and output.

public class SubArrayProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        for(int i =0; i<n; i++){
            for(int j =i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+"\t");
                }
                System.out.println();
            }
        }

    }
}
