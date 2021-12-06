package BasicOfProgramming.TwoD_Arrays;

import java.util.*;

//1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
//3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
//4. Consider this array a maze and a player enters from top-left corner in east direction.
//5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
//6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.


public class Exit_Point_Of_Matrix {
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

        int dir =0;
        int i =0,j=0;
        int prevI =0;
        int prevJ =0;


        while(i >=0 && i<n && j >= 0 && j<m){

            if(mat[i][j] == 1){
                dir = (dir+1)%4;
            }
            prevI = i;
            prevJ = j;


            if(dir == 0){
                j++;
            }else if(dir == 1){
                i++;
            }else if(dir == 2){
                j--;
            }else{
                i--;
            }


        }
        System.out.println(prevI+" "+prevJ);
    }
}
