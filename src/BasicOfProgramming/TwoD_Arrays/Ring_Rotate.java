package BasicOfProgramming.TwoD_Arrays;

import java.util.*;

public class Ring_Rotate {
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

        int s = scn.nextInt();
        int r = scn.nextInt();

        int[] oned = fillOnedArray(mat,s);
        rotate(oned,r);
        setRing(mat,oned,s);
        display(mat);
    }

    public static void rotate(int[] oned,int r){

        r = r % oned.length;
        if (r < 0) {
            r += oned.length;
        }

        int n = oned.length;
        reverse(oned,0,n-r-1);
        reverse(oned,n-r,n-1);
        reverse(oned,0,n-1);
    }

    public static void reverse(int[] arr, int i, int j){

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void setRing(int[][] mat ,int[] oned,int s){

        int idx =0;
        int frow = s-1, fcol = s-1, lrow = mat.length-s, lcol = mat[0].length -s;

        for(int i = frow; i<=lrow; i++){
            mat[i][fcol] = oned[idx];
            idx++;
        }
        fcol++;

        for(int i = fcol; i<=lcol; i++){
            mat[lrow][i] = oned[idx];
            idx++;
        }
        lrow--;


        for(int i =lrow; i >= frow; i--){
            mat[i][lcol] = oned[idx];
            idx++;
        }
        lcol--;


        for(int i =lcol; i >= fcol; i--){
            mat[frow][i] = oned[idx];
            idx++;
        }
        frow++;
    }

    public static int[] fillOnedArray(int[][] mat,int s){
        int frow = s-1, fcol = s-1, lrow = mat.length-s, lcol = mat[0].length -s;
        int size = 2*(lrow-frow) +2*(lcol - fcol);
        int[] oned = new int[size];
        int idx =0;


        for(int i = frow; i<=lrow; i++){
            oned[idx] = mat[i][fcol];
            idx++;
        }
        fcol++;

        for(int i = fcol; i<=lcol; i++){
            oned[idx] = mat[lrow][i];
            idx++;
        }
        lrow--;


        for(int i =lrow; i >= frow; i--){
            oned[idx] = mat[i][lcol];
            idx++;
        }
        lcol--;


        for(int i =lcol; i >= fcol; i--){
            oned[idx] = mat[frow][i];
            idx++;
        }
        frow++;
        return oned;
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
