package RecursionAndBacktracking.RecursionWithArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Subsequence {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        System.out.println(getSS(str,0));

    }
    public static ArrayList<String> getSS(String str, int idx){

        if(idx == str.length()){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> smallCase = getSS(str,idx+1);

        ArrayList<String> ans = new ArrayList<>();

        for(String s : smallCase){
           ans.add(s);
        }

        for(String s : smallCase){
            ans.add(str.charAt(idx)+s);
        }

       return ans;
    }
}
