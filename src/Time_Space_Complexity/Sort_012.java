package Time_Space_Complexity;

import java.util.Scanner;

public class Sort_012 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int i=0, j=0 ,k =arr.length-1;
        while(i <= k){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }else if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }else{
                i++;
            }
        }

        for(int p=0; p<n; p++) System.out.print(arr[p]+" ");
    }
}
