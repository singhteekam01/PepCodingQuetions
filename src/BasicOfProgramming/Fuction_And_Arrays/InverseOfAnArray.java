package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to calculate the inverse of array a.

public class InverseOfAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n =scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int[] res = new int[n];

        for(int i=0; i<n; i++){
            int idx = arr[i];
            res[idx] =i;
        }

        for(int i=0; i<n; i++){
            System.out.println(res[i]);
        }
    }
}
