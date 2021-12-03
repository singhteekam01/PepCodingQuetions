package BasicOfProgramming.Fuction_And_Arrays;

import java.util.Scanner;

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
//
// Assumption - Array is sorted. Array may have duplicate values.


public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        int st =-1;
        int end =-1;
        int i;

        i =0;
        while(i < n){
            if(arr[i]==d){
                st = i;
                break;
            }
            i++;
        }
        i =n-1;
        while(i >=0){
            if(arr[i] == d){
                end = i;
                break;
            }
            i--;
        }
        System.out.println(st);
        System.out.println(end);
    }
}
