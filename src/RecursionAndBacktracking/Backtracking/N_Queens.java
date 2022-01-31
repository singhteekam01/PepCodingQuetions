package RecursionAndBacktracking.Backtracking;

import java.util.*;

public class N_Queens {

    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[][] chess = new int[n][n];

        printQueens(chess,"",0);

    }
    public static void printQueens(int[][] chess, String ans, int row){

        if(row == chess.length){
            System.out.println(ans + ".");
            return;
        }

        for(int col =0; col < chess[0].length; col++){

            if(isQueenSafe(chess,row,col)){
                chess[row][col] = 1;
                printQueens(chess,ans + row + "-" + col+", ", row+1);
                chess[row][col] = 0;
            }
        }
    }
    public static boolean isQueenSafe(int[][] chess, int row ,int col){

        for(int i =row-1,j = col; i>=0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i =row-1, j = col-1; i >=0 && j >=0 ; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i =row-1, j = col+1; i >=0 && j < chess[0].length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
