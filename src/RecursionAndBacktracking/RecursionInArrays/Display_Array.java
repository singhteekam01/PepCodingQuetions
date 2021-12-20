package RecursionAndBacktracking.RecursionInArrays;

import java.util.Scanner;

public class Display_Array {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        DA(arr,0);
    }
    public static void DA(int[] arr, int idx){

        if(idx == arr.length) return;

        System.out.println(arr[idx]);
        DA(arr,idx+1);
    }
}
