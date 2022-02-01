package Time_Space_Complexity;

import java.util.Scanner;

public class Count_Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int min =arr[0], max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        countSort(arr,min,max);

        //display
        for(int i=0; i<n; i++) System.out.print(arr[i]+" ");
    }
    public static void countSort(int[] arr, int mn, int mx){
        int range = mx-mn+1;
        int freq[] = new int[range];
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]-mn]++;
        }
        //convert freq array into prefix sum array
        for(int i=1; i<freq.length; i++){
            freq[i] += freq[i-1];
        }

        for(int i=arr.length-1; i>=0 ;i--){
            int pos = freq[arr[i]-mn];
            ans[pos-1] = arr[i];
            freq[arr[i]-mn]--;
        }

        for(int i=0; i<arr.length; i++) arr[i] = ans[i];
    }
}
