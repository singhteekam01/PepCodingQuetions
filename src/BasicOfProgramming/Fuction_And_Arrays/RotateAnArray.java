package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to
// the left for negative values of k.

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();

        k %= n;
        if(k < 0){
            k += n;
        }

        reverse(arr,k);
        display(arr);

    }
    public static void reverse(int[] arr, int k){

        int st;
        int end;
        int n = arr.length;

        st = 0;
        end =n-k-1;

        while (st <= end) {
            swap(arr,st,end);
            st++;
            end--;
        }

        st = n-k;
        end = n-1;

        while (st <= end) {
            swap(arr,st,end);
            st++;
            end--;
        }

        st =0;
        end =n-1;

        while (st <= end) {
            swap(arr,st,end);
            st++;
            end--;
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display(int[] arr){

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
