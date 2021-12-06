package BasicOfProgramming.TwoD_Arrays;

import java.util.Scanner;

public class The_State_Of_Wakanda_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] mat = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        for(int gap =0; gap<n; gap++){
            for(int i=0,j = gap+i; j<n; j++,i++){
                System.out.println(mat[i][j]);
            }
        }
    }
}
