package BasicOfProgramming.TwoD_Arrays;

import java.util.*;

// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a.
// 4. You are required to traverse and print the contents of the 2d array in form of a spiral.
// Note - Please check the sample output for details.

public class Spiral_Display {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];
        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        int fRow = 0,fCol =0,lRow =n-1, lCol =m-1;

        int count =0;

        while(true){

            for(int i=fRow; i<=lRow; i++){
                System.out.println(mat[i][fCol]);

                count++;
                if(count == m*n){
                    return;
                }
            }
            fCol++;

            for(int i =fCol; i<=lCol; i++){
                System.out.println(mat[lRow][i]);

                count++;
                if(count == m*n){
                    return;
                }
            }
            lRow--;

            for(int i=lRow; i>=fRow; i--){
                System.out.println(mat[i][lCol]);

                count++;
                if(count == m*n){
                    return;
                }
            }
            lCol--;

            for (int i=lCol; i>=fCol; i--){
                System.out.println(mat[fRow][i]);

                count++;
                if(count == m*n){
                    return;
                }
            }
            fRow++;
        }

    }
}
