package Time_Space_Complexity;
import java.util.*;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        for(int i=0; i<arr.length-1; i++){
            for(int j= i+1; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
