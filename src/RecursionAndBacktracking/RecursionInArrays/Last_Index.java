package RecursionAndBacktracking.RecursionInArrays;

import java.util.Scanner;

public class Last_Index {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        int ans = LI(arr,n-1,x);
        System.out.println(ans);
    }
    public static int LI(int[] arr, int idx,int x){

        if(idx == -1) return -1;

        if(arr[idx] == x){
            return idx;
        }else{
            return LI(arr,idx-1,x);
        }
    }
}
