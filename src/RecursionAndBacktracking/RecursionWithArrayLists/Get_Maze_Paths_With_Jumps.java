package RecursionAndBacktracking.RecursionWithArrayLists;

import java.io.*;
import java.util.*;


public class Get_Maze_Paths_With_Jumps {

        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();

            int m = scn.nextInt();

            System.out.println(getMazePaths(0,0,n-1,m-1));
        }

        // sr - source row
        // sc - source column
        // dr - destination row
        // dc - destination column
        public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

            if(sr == dr && sc == dc){
                ArrayList<String> base = new ArrayList<>();
                base.add("");
                return base;
            }

            ArrayList<String> ans = new ArrayList<>();

            int jumps;

            jumps = 1;
            while(sc+jumps <= dc){
                ArrayList<String> smallAns = getMazePaths(sr,sc+jumps,dr,dc);

                for(String s : smallAns){
                    ans.add("h"+jumps+s);
                }

                jumps++;
            }

            jumps = 1;
            while(sr+jumps <= dr){
                ArrayList<String> smallAns = getMazePaths(sr+jumps,sc,dr,dc);

                for(String s : smallAns){
                    ans.add("h"+jumps+s);
                }

                jumps++;
            }

            jumps = 1;
            while(sr+jumps <= dr && sc+jumps <= dc){
                ArrayList<String> smallAns = getMazePaths(sr+jumps,sc+jumps,dr,dc);

                for(String s : smallAns){
                    ans.add("d"+jumps+s);
                }

                jumps++;
            }

            return ans;

        }
}
