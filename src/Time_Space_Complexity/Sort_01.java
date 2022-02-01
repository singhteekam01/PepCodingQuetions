package Time_Space_Complexity;

import java.util.Scanner;

public class Sort_01 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int i=0, j=0;
        while(i < arr.length){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j++;
            }else{
                i++;
            }
        }

        for(int k=0; k<n; k++) System.out.print(arr[k]+" ");
    }
}
