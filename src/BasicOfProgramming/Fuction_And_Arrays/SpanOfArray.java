package BasicOfProgramming.Fuction_And_Arrays;

import java.util.Scanner;

// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

public class SpanOfArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int ans = span(arr);

        System.out.println(ans);

    }
    public static int span(int[] arr){
        int max =Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max-min;
    }
}
