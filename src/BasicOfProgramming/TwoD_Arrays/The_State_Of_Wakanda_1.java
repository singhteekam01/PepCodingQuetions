package BasicOfProgramming.TwoD_Arrays;

import java.util.*;


// 1. You will be given a number n, representing the number of rows.
// 2. You will be given a number m, representing the number of columns.
// 3. You will be given n*m numbers, representing elements of 2d arrays


public class The_State_Of_Wakanda_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] mat = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        for(int j=0; j<m; j++){
            if(j%2 ==0){
                for(int i =0; i<n; i++){
                    System.out.println(mat[i][j]);
                }
            }else {
                for(int i = n-1; i>=0; i--){
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}
