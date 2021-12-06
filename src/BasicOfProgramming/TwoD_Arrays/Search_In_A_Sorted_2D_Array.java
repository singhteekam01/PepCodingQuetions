package BasicOfProgramming.TwoD_Arrays;

import java.io.*;
import java.util.*;

public class Search_In_A_Sorted_2D_Array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt();

        for(int i=0; i<n; i++){

            int lValue = mat[i][0];
            int rValue = mat[i][n-1];

            if(x >= lValue && x <= rValue){
                int low =0,high =n-1;
                while(low <= high){
                    int mid = low +(high-low)/2;

                    if(mat[i][mid] == x){
                        System.out.println(i);
                        System.out.println(mid);
                        return;
                    }else if(mat[i][mid] > x){
                        high = mid -1;
                    }else{
                        low = mid+1;
                    }
                }
            }

        }
        System.out.println("Not Found");
    }

}
