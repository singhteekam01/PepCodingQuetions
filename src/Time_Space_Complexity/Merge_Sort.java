package Time_Space_Complexity;

import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = scn.nextInt();

        int res[] = mergeSort(arr,0,arr.length-1);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] mergeSort(int[] a,int lo, int hi){
        if(lo == hi){
            int[] base = new int[1];
            base[0] = a[lo];
            return base;
        }

        int mid = (lo+hi)/2;
        int[] fsh = mergeSort(a,lo,mid);
        int[] ssh = mergeSort(a,mid+1,hi);

        return mergeTwoSortedArr(fsh,ssh);
    }
    public static int[] mergeTwoSortedArr(int[] a, int[] b){
        int[] res = new int[a.length+b.length];
        int i=0, j=0, k=0;

        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                res[k]  = a[i];
                i++; k++;
            }else{
                res[k] = b[j];
                j++; k++;
            }
        }
        while(i < a.length){
            res[k] = a[i];
            i++; k++;
        }
        while(j < b.length){
            res[k] = b[j];
            j++; k++;
        }
        return res;
    }

}
