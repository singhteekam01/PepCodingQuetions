package BasicOfProgramming.TwoD_Arrays;

// 1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
// 2. You are required to find the saddle price of the given matrix and print the saddle price.
// 3. The saddle price is defined as the least price in the row but the maximum price in the column of
// the matrix.


import java.util.Scanner;

public class Saddle_Price {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            int idx =0;
            for(int j=0; j<n; j++){
                if(mat[i][j] < min){
                    min = mat[i][j];
                    idx = j;
                }
            }

            if (isMaximum(mat,idx,min)){
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid input");
    }
    public static boolean isMaximum(int[][] mat, int idx,int min){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<mat.length; i++){
            if(mat[i][idx] > max){
                max = mat[i][idx];
            }
        }
        if(max == min){
            return true;
        }
        return false;
    }
}
