package RecursionAndBacktracking.RecursionInArrays;

import java.util.Scanner;

public class Max_Of_An_Array {
    public static void main(String[] args) {

        Scanner scn  = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i= 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int ans = MOA(arr,0);
        System.out.println(ans);
    }

    public static int MOA(int[] arr,int idx){

        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }

        int maxnm1 = MOA(arr,idx+1);

        if(maxnm1 > arr[idx]) return maxnm1;

        else return  arr[idx];

    }
}
