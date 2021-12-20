package RecursionAndBacktracking.RecursionInArrays;

import java.util.Scanner;

public class Display_Array_In_Reverse {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        DAR(arr,0);
    }
    public static void DAR(int[] arr,int idx){

        if(idx == arr.length) return;

        DAR(arr,idx+1);
        System.out.println(arr[idx]);
    }
}
