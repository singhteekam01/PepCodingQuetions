package RecursionAndBacktracking.RecursionWithArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Maze_Paths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int m = scn.nextInt();

        ArrayList<String> ans  = GMP(0,0,n-1,m-1);

        System.out.println(ans);
    }
    public static ArrayList<String> GMP(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        else if( sr < 0 || sr > dr || sc < 0 || sc > dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }

        ArrayList<String> ans = new ArrayList<>();

        ArrayList<String> smallCases;

        smallCases = GMP(sr,sc+1,dr,dc);
        for(String s : smallCases){
            ans.add("h"+s);
        }


        smallCases = GMP(sr+1,sc,dr,dc);
        for(String s : smallCases){
            ans.add("v"+s);
        }

        return ans;
    }
}
