package RecursionAndBacktracking.RecursionOnTheWayUp;

import java.util.Scanner;

public class Print_Maze_Paths_With_Jumps {
        public static void main(String[] args) throws Exception {

            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt();

            int m = scn.nextInt();

            printMazePaths(0,0,n-1,m-1,"");
        }

        // sr - source row
        // sc - source column
        // dr - destination row
        // dc - destination column
        public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

            if(sr == dr && sc == dc){
                System.out.println(psf);
                return;
            }

            int jumps;

            jumps = 1;
            while(sc+jumps <= dc){
                printMazePaths(sr,sc+jumps,dr,dc,psf+"h"+jumps);
                jumps++;
            }

            jumps =1;
            while(sr+jumps <= dr){
                printMazePaths(sr+jumps,sc,dr,dc,psf+"v"+jumps);
                jumps++;
            }

            jumps =1;
            while(sc+jumps <= dc && sr+jumps <= dr){
                printMazePaths(sr+jumps,sc+jumps,dr,dc,psf+"d"+jumps);
                jumps++;
            }

        }
}
