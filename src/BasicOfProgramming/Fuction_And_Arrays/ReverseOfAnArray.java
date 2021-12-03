package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to reverse the contents of array a.

public class ReverseOfAnArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int st = 0;
        int end = arr.length-1;

        while(st <= end){
            swap(arr,st,end);
            st++;
            end--;
        }

        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
