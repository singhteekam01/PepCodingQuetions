package BasicOfProgramming.TwoD_Arrays;

import java.util.*;

// 1. You are given a number n, representing the number of rows and number of columns.
// 2. You are given n*n numbers, representing elements of 2d array a.
// 3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
// *Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*


public class Rotate_By_90_Degree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] mat  = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        transpose(mat);
        swapCol(mat);
        display(mat);
    }
    public static void transpose(int[][] mat){
        int len = mat.length;

        for(int i=0; i<len; i++){
            for(int j =i; j<len; j++){
                swap(mat,i,j);
            }
        }
    }
    public static void swap(int[][] mat,int a,int b){
        int temp = mat[a][b];
        mat[a][b] = mat[b][a];
        mat[b][a] = temp;

    }
    public static void swapCol(int[][] mat){
        int len = mat.length;

        for(int j =0; j<len/2; j++){
            for(int i=0; i<len; i++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][len-1-j];
                mat[i][len-1-j] = temp;
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
