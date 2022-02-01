package Time_Space_Complexity;

import java.util.Scanner;

public class Quick_Select {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int k = scn.nextInt();

        int ans = quickSelect(arr,0,arr.length-1,k);

        //display
        System.out.print(ans);
    }
    public static int quickSelect(int[] arr, int lo, int hi,int k){
        int pivot = arr[hi];
        int pdx  = partition(arr,lo,hi,pivot);
        if(k-1 < pdx){
            return quickSelect(arr,lo,pdx-1,k);
        }else if(k-1 > pdx){
            return quickSelect(arr,pdx+1,hi,k);
        }else{
            return arr[pdx];
        }
    }
    public static int partition(int[] arr,int lo, int hi,int pivot){
        int i =lo, j= lo;
        while(i <= hi){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }else{
                i++;
            }
        }
        return j-1;
    }
}
