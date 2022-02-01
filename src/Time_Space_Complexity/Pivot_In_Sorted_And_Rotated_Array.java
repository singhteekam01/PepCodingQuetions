package Time_Space_Complexity;

import java.util.Scanner;

public class Pivot_In_Sorted_And_Rotated_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr  = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int lo= 0,hi = arr.length-1;

        while(lo < hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] > arr[hi]){
                lo = mid+1;
            }else{
                hi = mid;
            }
        }
        System.out.println(arr[lo]);
    }
}
