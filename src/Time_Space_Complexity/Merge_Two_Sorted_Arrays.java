package Time_Space_Complexity;
import java.util.*;

public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for(int i=0; i<n; i++) arr1[i] = scn.nextInt();

        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for(int i=0; i<m; i++) arr2[i] = scn.nextInt();

        int[] ans = new int[n+m];

        int i=0,j=0,k=0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                i++; k++;
            }else{
                ans[k] = arr2[j];
                j++; k++;
            }
        }
        while(i < arr1.length){
            ans[k] = arr1[i];
            i++; k++;
        }
        while(j < arr2.length){
            ans[k] = arr2[j];
            j++; k++;
        }

        for(int p=0; p<ans.length; p++){
            System.out.print(ans[p]+" ");
        }
    }
}
