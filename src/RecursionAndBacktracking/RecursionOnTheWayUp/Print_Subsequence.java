package RecursionAndBacktracking.RecursionOnTheWayUp;


import java.io.*;
import java.util.*;


public class Print_Subsequence {
        public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);

            String str = scn.next();

            printSS(str,"");
        }

        public static void printSS(String str, String ans) {

            if(str.length() == 0){
                System.out.println(ans);
                return;
            }

            printSS(str.substring(1),ans+str.charAt(0));

            printSS(str.substring(1),ans);
        }
}
