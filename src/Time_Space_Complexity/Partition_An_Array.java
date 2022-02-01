package Time_Space_Complexity;

import java.util.Scanner;

public class Partition_An_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int pivot = scn.nextInt();

        partition(arr,pivot);

        //display
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    private static void partition(int[] arr,int pivot){
        int i=0, j=0;
        while(i < arr.length){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }else{
                i++;
            }
        }
    }
}
