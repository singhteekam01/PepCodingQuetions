package RecursionAndBacktracking.RecursionInArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class All_Indices {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int size) {
        // write ur code here

        if(idx == arr.length){
            int[] base = new int[size];
            return base;
        }

        if(arr[idx] == x){
            int[] temp =  allIndices(arr,x,idx+1,size+1);
            temp[size] = idx;
            return temp;
        }

        else{
            return allIndices(arr,x,idx+1,size);
        }
    }
}
