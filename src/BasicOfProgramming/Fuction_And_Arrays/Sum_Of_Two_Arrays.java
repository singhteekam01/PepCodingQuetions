package BasicOfProgramming.Fuction_And_Arrays;

import java.io.*;
import java.util.*;

// 1. You are given a number n1, representing the size of array a1.
// 2. You are given n1 numbers, representing elements of array a1.
// 3. You are given a number n2, representing the size of array a2.
// 4. You are given n2 numbers, representing elements of array a2.
// 5. The two arrays represent digits of two numbers.
// 6. You are required to add the numbers represented by two arrays and print the
// arrays.


public class Sum_Of_Two_Arrays {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        //input the first array
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for(int i=0; i<n1; i++){
            arr1[i] = scn.nextInt();
        }

        //input the second array
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for(int i=0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }

        //declaring an array for storing the answer
        int n3 = Math.max(n1,n2)+1;
        int[] res = sumOfArrays(arr1,arr2,n3);

        display(res);

    }

    public static int[] sumOfArrays(int[] arr1, int[] arr2,int n3){
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = n3-1;

        int[] res  = new int[n3];

        int carry =0;

        while(k > 0){
            int d1 = (i >= 0) ? arr1[i] : 0;
            int d2 = (j >= 0) ? arr2[j] : 0;

            res[k] = (d1+d2+carry)%10;

            carry = (d1+d2+carry)/10;

            i--;
            j--;
            k--;
        }
        return res;

    }

    public static void display(int[] res){

        int count =0;
        for(int i =0; i<res.length; i++){
            if(res[i] == 0){
                count++;
            }else{
                break;
            }
        }

        for(int i = count; i<res.length; i++){
            System.out.println(res[i]);
        }

    }

}