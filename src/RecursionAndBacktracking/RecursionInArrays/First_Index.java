package RecursionAndBacktracking.RecursionInArrays;

import java.util.Scanner;

public class First_Index {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int ans = FI(arr,0,x);
        System.out.println(ans);
    }
    public static int FI(int[] arr, int idx,int x){

        if(idx == arr.length) return -1;

        if(arr[idx] == x){
            return idx;
        }else{
            return FI(arr,idx+1,x);
        }

    }
}
