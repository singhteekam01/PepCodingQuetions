package BasicOfProgramming.Fuction_And_Arrays;

import java.util.*;

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to find the difference of two numbers represented
// by two arrays and print the arrays. a2 - a1

// Assumption - number represented by a2 is greater.


public class DifferenceOfTwoArrays {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for(int i =0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }

        int n3 = Math.max(n1,n2);

        int[] res = differenceOfArrays(arr1,arr2,n3);

        display(res);

    }
    public static int[] differenceOfArrays(int[] arr1, int[] arr2, int n3){

        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = n3-1;
        int carry =0;

        int[] res = new int[n3];

        while(k >= 0){
            int d1 = (i >= 0) ? arr1[i] : 0;
            int d2 = (j >= 0) ? arr2[j] : 0;

            if(d2+carry < d1){
                d2 = d2+10;
                res[k] = (d2+carry-d1)%10;
                carry = -1;
            }else{
                res[k] = (d2+carry-d1)%10;
                carry =0;
            }

            i--; j--; k--;

        }
        return res;
    }
    public static void display(int[] res){

        int count =0;
        for(int i=0; i<res.length; i++){
            if(res[i] == 0){
                count++;
            }else{
                break;
            }
        }

        for (int i=count ;i<res.length; i++){
            System.out.println(res[i]);
        }
    }

}
