package Time_Space_Complexity;

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum_Pairs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int tar = scn.nextInt();

        Arrays.sort(arr);

        int i=0, j=arr.length-1;
        while(i < j){
            if(arr[i]+arr[j] > tar){
                j--;
            }else if(arr[i]+arr[j] < tar){
                i++;
            }else{
                System.out.println(arr[i] +"  "+arr[j]);
                i++; j--;
            }
        }
    }
}
