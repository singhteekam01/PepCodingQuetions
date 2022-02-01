package Time_Space_Complexity;

import java.util.Scanner;

public class Radix_Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int max = arr[0];
        for(int i=0; i<n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int exp = 1;
        while(max/exp > 0){
            countSort(arr,exp);
            exp *= 10;
        }

        for(int i=0; i<arr.length; i++) System.out.println(arr[i]);

    }
    public static void countSort(int[] arr,int exp){
        int freq[] = new int[10];
        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            freq[(arr[i]/exp)%10]++;
        }
        //convert freq array into prefix sum array
        for(int i=1; i<freq.length; i++){
            freq[i] += freq[i-1];
        }

        for(int i=arr.length-1; i>=0 ;i--){
            int pos = freq[(arr[i]/exp)%10];
            ans[pos-1] = arr[i];
            freq[(arr[i]/exp)%10]--;
        }

        for(int i=0; i<arr.length; i++) arr[i] = ans[i];
    }
}
