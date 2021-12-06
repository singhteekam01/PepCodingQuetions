package BasicOfProgramming.TwoD_Arrays;

import java.util.*;

// 1. You are given a number n1, representing the number of rows of 1st matrix.
// 2. You are given a number m1, representing the number of columns of 1st matrix.
// 3. You are given n1*m1 numbers, representing elements of 2d array a1.
// 4. You are given a number n2, representing the number of rows of 2nd matrix.
// 5. You are given a number m2, representing the number of columns of 2nd matrix.
// 6. You are given n2*m2 numbers, representing elements of 2d array a2.
// 7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
// 8. If the two arrays can't be multiplied, print "Invalid input".

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] mat = new int[n1][m1];

        for(int i=0; i<n1; i++){
            for(int j=0; j<m1; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] mat2 = new int[n2][m2];
        for(int i=0; i<n2; i++){
            for (int j=0; j<m2; j++){
                mat2[i][j] = scn.nextInt();
            }
        }

        if(m1 != n2){
            System.out.println("Invalid input");
        }

        display(matrixProduct(mat,mat2));

    }

    public static int[][] matrixProduct(int[][] mat1, int[][] mat2){
        int n1 = mat1.length;
        int m1 = mat1[0].length;

        int m2 = mat2[0].length;

        int[][] res = new int[n1][m2];

        for(int i=0; i<n1; i++){
            for(int j=0; j<m2; j++){
                int temp =0;
                for(int k =0; k<m1; k++){
                    temp += mat1[i][k]*mat2[k][j];
                }
                res[i][j] = temp;
            }
        }

        return res;
    }

    public static void display(int[][] res){

        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
