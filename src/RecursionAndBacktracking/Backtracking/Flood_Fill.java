package RecursionAndBacktracking.Backtracking;

import java.util.*;

public class Flood_Fill {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }

    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {

        if(sr == maze.length-1 && sc == maze[0].length-1){
            System.out.println(asf);
            return;
        }

        else if(sr >= maze.length || sr < 0 || sc >= maze[0].length || sc < 0 || maze[sr][sc] == 1){
            return;
        }

        maze[sr][sc] = 1;
        //call up
        floodfill(maze,sr-1,sc,asf+"t");

        //call left
        floodfill(maze,sr,sc-1,asf+"l");

        //call down
        floodfill(maze,sr+1,sc,asf+"d");

        //call right
        floodfill(maze,sr,sc+1,asf+"r");

        maze[sr][sc] = 0;

    }
}

