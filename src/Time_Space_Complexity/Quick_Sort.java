package Time_Space_Complexity;

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        quickSort(arr,0,arr.length-1);

        //display
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int[] arr, int lo, int hi){
        if(lo > hi){
            return;
        }

        int pivot = arr[hi];
        int pdx  = partition(arr,lo,hi,pivot);
        quickSort(arr,lo,pdx-1);
        quickSort(arr,pdx+1,hi);
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
