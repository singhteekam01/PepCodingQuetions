package RecursionAndBacktracking.RecursionWithArrayLists;

import java.util.*;

public class Get_Stair_Paths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        ArrayList<String> ans = gsp(n);
        System.out.println(ans);
    }
    public static ArrayList<String> gsp(int n){

        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        else if(n < 0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> onesPath = gsp(n-1);
        ArrayList<String> twosPaths = gsp(n-2);
        ArrayList<String> threePaths = gsp(n-3);

        ArrayList<String> ans = new ArrayList<>();

        for(String s : onesPath){
            ans.add("1"+s);
        }

        for(String s : twosPaths){
            ans.add("2"+s);
        }

        for(String s : threePaths){
            ans.add("3"+s);
        }

        return ans;
    }
}
