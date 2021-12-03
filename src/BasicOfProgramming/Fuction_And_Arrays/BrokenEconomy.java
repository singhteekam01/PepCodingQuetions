package BasicOfProgramming.Fuction_And_Arrays;

import java.util.Scanner;


// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of the array a.
// 3. You are given another number d.
// 4. You are required to find the ceil and floor of d in array a.

public class BrokenEconomy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<n; i++){
            if(arr[i] == d){
                System.out.println(arr[i]);
                return;
            }
            else if(d < arr[i]){
                System.out.println(arr[i]);
                System.out.println(arr[i-1]);
                return;
            }
        }

    }
}
